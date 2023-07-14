public class MethodsWithParameters {
    public static void main(String[] args) {
        // Calling methods with different types of parameters
        greet("Samin");
        int sumResult = sum(5, 7);
        double productResult = multiply(3.5, 2.0);

        System.out.println("Sum: " + sumResult);
        System.out.println("Product: " + productResult);
    }

    // Method with a single parameter
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with multiple parameters
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method with different parameter types
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
