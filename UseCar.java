import OurObject.Car;
import java.util.Scanner;

public class UseCar {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car speed: " + car.getSpeed());

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (accel(accelerate), brake, damage, exit, or");
            System.out.println("checkspeed, checkhp): ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("accelerate") || command.equalsIgnoreCase("accel")) {
                car.accelerate();

            } else if (command.equalsIgnoreCase("brake")) {
                car.brake();

            } else if (command.equalsIgnoreCase("damage")) {
                Car damagedCar = car.takeDamage();
                if (damagedCar == null) {
                    System.out.println("The car is destroyed and can no longer be used.");
                    break;
                } else {
                    System.out.println("Car hit points: " + damagedCar.getHitPoints());
                }

            } else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;

            } else if (command.equalsIgnoreCase("checkspeed")) {
                // Checking speed and hit points commands to show the use of getter methods.
                System.out.println("Car speed: " + car.getSpeed());

            } else if (command.equalsIgnoreCase("checkhp")) {
                System.out.println("Car hit points: " + car.getHitPoints());

            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
        scan.close();
        System.out.println("Program ended.");
    }
}
