package OurObject;

public class Car {
    private Car self;
    private int hitPoints = 2;
    private int accelerationSpeed = 20;
    private int speed = 0;
    private int maxSpeed = 100;

    // Constructor to initialize the self reference
    public Car() {
        self = this; // Initialize self reference
    }

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += accelerationSpeed;
        } else {
            System.out.println("YOU ARE TOO FAST! CANT SPEED UP ANYMORE!");
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= accelerationSpeed;
        } else {
            System.out.println("You've come to stopped, do something else.");
        }
    }

    private void tryDying() {
        if (hitPoints <= 0) {
            die();
        }
    }

    private void die() {
        // Return the car itself if still alive, otherwise null
        System.out.println("Car is destroyed!");
        self = null; // Simulate the car being destroyed
    }

    public Car takeDamage() {
        hitPoints--;
        // The code now easier to tell we're checking if we dies after taking damage, and we can also easily change the code to do something else before dying if we want to.
        tryDying();
        return self;
    }

    public int getSpeed() {
        return speed;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
