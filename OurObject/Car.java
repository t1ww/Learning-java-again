package OurObject;

public class Car {
    private Car self;
    private int hitPoints = 2;
    private int accelerationSpeed = 20;
    private int speed = 0;
    private int maxSpeed = 200;

    // Constructor to initialize the self reference
    public Car() {
        self = this; // Initialize self reference
    }

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += accelerationSpeed;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= accelerationSpeed;
        }
    }

    public Car takeDamage() {
        hitPoints--;
        if (hitPoints <= 0) {
            // Return the car itself if still alive, otherwise null
            System.out.println("Car is destroyed!");
            self = null; // Simulate the car being destroyed
        }
        return self;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
