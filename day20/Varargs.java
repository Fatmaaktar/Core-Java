package day20;

public class Varargs {
    public static void main(String[] args) {
        add(5, 7);
        add(5, 7, -15);
        add(5, 7, -15, 20);
        add(5, 7, -15, 20, 30);
    }

    public static void add(int... sayi) {
        int toplam = 0;
        for (int i : sayi) {
            toplam += i;
        }
        System.out.println("Girilen Sayilarin Toplami :" + toplam);
    }
}
