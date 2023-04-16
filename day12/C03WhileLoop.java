package day12;
public class C03WhileLoop {
    public static void main(String[] args) {
        int sayi = 3;

        while (sayi <= 13) {
            sayi++;
            if (sayi % 2 != 0) {
                System.out.println(sayi);
            }

        }
    }
}
