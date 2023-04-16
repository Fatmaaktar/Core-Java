package day12;

import java.util.Scanner;

public class C08While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("Lutfen Bir Rakam Giriniz :");
        sayi = scan.nextInt();
        int toplam = 0;
        while (sayi > 0) {
            toplam = toplam + sayi % 10;
            sayi = sayi / 10;

        }
        System.out.println("Toplam = " + toplam);


    }
}
