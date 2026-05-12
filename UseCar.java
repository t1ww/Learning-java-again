import OurObject.Car;
import java.util.Scanner;

public class UseCar {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car speed: " + car.getSpeed());

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (accelerate, brake, damage, exit): ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("accelerate")) {
                car.accelerate();
                System.out.println("Car speed: " + car.getSpeed());
            } else if (command.equalsIgnoreCase("brake")) {
                car.brake();
                System.out.println("Car speed: " + car.getSpeed());
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
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
        scan.close();
    }
}
