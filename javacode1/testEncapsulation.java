class Employee {
    private int id;
    String name;

    public void set(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void get() {
        System.out.println(id);
        System.out.println(name);
    }

}

public class testEncapsulation {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.set(1, "Aditya");
        e.get();

    }

}
