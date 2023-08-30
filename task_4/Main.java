interface Worker {
    void work();
}

interface Driver {
    void drive();
}

interface Cook {
    void cook();
}

class OrdinaryWorker implements Worker {
    public void work() {
        System.out.println("Ordinary worker is working.");
    }
}


class TruckDriver implements Driver {
    public void drive() {
        System.out.println("Truck driver is driving.");
    }
}

class Chef implements Cook {
    public void cook() {
        System.out.println("Chef is cooking.");
    }
}

public class Main {
    public static void main(String[] args) {

        Worker worker = new OrdinaryWorker();
        worker.work();

        Driver driver = new TruckDriver();
        driver.drive();

        Cook cook = new Chef();
        cook.cook();
    }
}


