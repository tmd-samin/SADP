public class ObjectCreation {
    public static void main(String[] args) {
        // Creating objects using the 'new' keyword
        Person person1 = new Person("Abir", 25);
        Person person2 = new Person("Kobir", 30);

        // Accessing object properties and methods
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());

        person1.sayHello();
        person2.sayHello();
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}
