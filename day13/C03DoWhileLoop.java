package day13;

import java.util.Scanner;

public class C03DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        int count = 0;

        do {
                System.out.println("Lutfen Sayi Giriniz :");
                sayi = scan.nextInt();
                toplam += sayi;
                count++;
        } while (toplam<500);

        System.out.println("Toplam : " + toplam);
        System.out.println(count + "Adet Sayisi");
    }
}
