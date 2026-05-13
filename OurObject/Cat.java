package OurObject;

public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getInfo() {
        return "Name: " + name + ", Age: " + age + ", Color: " + color;
    }

    public void meow() {
        System.out.println(name + " says: Meow!");
    }
}
