interface vehicle {
    public void run();

}

class bike implements vehicle {
    public void run() {
        System.out.println("Running");
    }
}

public class testinterface {
    public static void main(String args[]) {
        vehicle v = new bike();
        v.run();

    }

}
