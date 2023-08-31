interface Product {
    void doSomething();
}
class ConcreteProductA implements Product {
    public void doSomething() {
        System.out.println("ConcreteProductA is doing something.");
    }
}

class ConcreteProductB implements Product {
    public void doSomething() {
        System.out.println("ConcreteProductB is doing something.");
    }
}
interface ProductFactory {
    Product createProduct();
}
class ConcreteProductAFactory implements ProductFactory {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteProductBFactory implements ProductFactory {
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
public class Main {
    public static void main(String[] args) {
        ProductFactory factoryA = new ConcreteProductAFactory();
        Product productA = factoryA.createProduct();
        productA.doSomething();

        ProductFactory factoryB = new ConcreteProductBFactory();
        Product productB = factoryB.createProduct();
        productB.doSomething();
    }
}
