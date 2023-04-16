package day12;

import java.util.Scanner;

public class C11DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam = -1;
        int count = 0;

        do {
            System.out.println("Lutfen Sayi Giriniz, cikis icin sifir giriniz :");
            sayi = scan.nextInt();
            toplam += sayi;
            count++;
        } while (sayi != 0);

        System.out.println("Toplam : " + toplam);
        System.out.println(count + "Adet Sayisi");
    }
}
