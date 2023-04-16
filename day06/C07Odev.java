package day06;

import java.util.Locale;
import java.util.Scanner;

public class C07Odev {
    public static void main(String[] args) {
        char sifre;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Sifreyi Giriniz :");
        sifre = scan.nextLine().charAt(0);

        if (sifre >= 'A' && sifre <= 'Z') {
            if (sifre == 'A') {
                System.out.println("Gecerli Sifre");
            }
        } else System.out.println("Gecersiz Sifre");

        if (sifre >= 'a' && sifre <= 'z') {
            if ((sifre == 'z')) {
                System.out.println("Gecerli Sifre");
            }

        } else System.out.println("Gecersiz Sifre");

    }
}
