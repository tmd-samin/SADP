public class AccessModifier {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Accessing public variables and methods
        employee.name = "Abir";
        employee.age = 30;
        employee.displayInformation();

        // Accessing private variables (using public methods)
        employee.setSalary(5000.0);
        System.out.println("Salary: " + employee.getSalary());

        // Accessing protected variables (using inheritance)
        Manager manager = new Manager();
        manager.name = "Samin";
        manager.age = 25;
        manager.department = "marketing";
        manager.displayInformation();

        // Accessing default (package-private) variables and methods
        manager.setBonus(1000.0);
        System.out.println("Bonus: " + manager.getBonus());
    }
}

class Employee {
    public String name;
    public int age;
    private double salary;

    public void displayInformation() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    protected String department;
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
