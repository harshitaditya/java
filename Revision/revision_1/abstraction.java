abstract class demo {
    public void output() {
    }

}

public class abstraction extends demo {
    public void output() {
        System.out.println("Abstarction");
    }

    public static void main(String args[]) {
        abstraction obj = new abstraction();
        obj.output();
    }

}
