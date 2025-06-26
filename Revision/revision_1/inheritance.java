class Animal {
    public void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog can bark");
    }
}

class BabyDog extends Dog {
    public void weep() {
        System.out.println("Baby dog Weep");
    }
}

public class inheritance {
    public static void main(String args[]) {
        BabyDog obj = new BabyDog();
        obj.bark();
        obj.eat();
        obj.weep();

    }

}
