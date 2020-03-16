package hr.fer.oop.lab2.prob5;

public class Shapes {
    public static void main(String[] args) {
        line();
        bottom();

        top();
        line();

        top();
        bottom();

        bottom();
        line();

        top();
        line();
    }

    private static void top() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    private static void bottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    private static void line() {
        System.out.println("+--------+");
    }
}
