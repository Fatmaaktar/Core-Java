package day20;

public class Go {
    public static void main(String[] args) {
        new Go().Go(1, "Hello");
        new Go().Go(2, "Hello", "Hi");
        new Go().Go(3, "Hello", "Hi", "Fatma");

    }

    public void Go(int x, String... y) {
        System.out.println(y[y.length - x] + " ");
    }
}
