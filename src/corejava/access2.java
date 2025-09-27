package corejava;

public class access2 {
    public int a = 9;

    // Choose only one access modifier
    public void display() {
        System.out.println("welcome");
    }

    public static void main(String[] args) {
        access2 p = new access2();
        System.out.println(p.a);
        p.display();
    }
}
