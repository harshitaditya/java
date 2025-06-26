
class Animal {
    public void weep() {
        System.out.println("Weeping");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking");
    }
}

public class TestInheritance {
    public static void main(String args[]) {
        Dog obj = new Dog();
        obj.weep();

    }

}
