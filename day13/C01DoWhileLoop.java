package day13;

import java.util.Scanner;

public class C01DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        int sayac = -1;
        int negatif = 0;
        do {
            System.out.println("Lutfen Pozitif Bir Sayi Giriniz( cikis icin sifir giriniz) :");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
            if (sayi < 0) {
                System.out.println("Nehatif Sayi Giremezsiniz!!!");
                negatif++;
            }
        } while (sayi != 0);
        System.out.println("Toplam :" + toplam);
        System.out.println("Pozitif Adet Sayisi :" + (sayac - negatif));
        System.out.println("Negatif Adet Sayisi :" + negatif);
    }
}
