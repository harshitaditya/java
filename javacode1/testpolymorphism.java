// class vehicle {
//     public void run() {
//         System.out.println("Vehicle is running");
//     }
// }

// class bike extends vehicle {
//     public void run() {
//         System.out.println("bike is running");
//     }

// }
class A {
    int a = 10;
    int b = 20;

    public void sum() {
        System.out.println(a + b);

    }

    public int sum(int a, int b) {
        return a + b;
    }
}

public class testpolymorphism {
    public static void main(String args[]) {
        A b = new A();
        System.out.println(b.sum(1, 2));

    }

}
