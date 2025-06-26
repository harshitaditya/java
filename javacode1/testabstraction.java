abstract class Vehicle {
    abstract void run();

}

class bike extends Vehicle {
    public void run() {
        System.out.println("Running");

    }
}

public class testabstraction {
    public static void main(String args[]) {
        bike b = new bike();
        b.run();

    }

}
