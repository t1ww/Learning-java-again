import OurObject.Cat;
import java.util.Scanner;

public class UseCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Whiskers", 3, "Orange");

        System.out.println(cat1.getInfo());
        System.out.println(cat2.getInfo());

        cat1.meow();
        cat2.meow();
    }
}
