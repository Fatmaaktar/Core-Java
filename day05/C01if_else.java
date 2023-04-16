package day05;

import java.util.Scanner;

public class C01if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int kisaK, uzunK;
//        System.out.println("Kisa Kenari Giriniz :");
//        kisaK = scan.nextInt();
//
//        System.out.println("Uzun Kenari Giriniz :");
//        uzunK = scan.nextInt();
//
//        if (uzunK == kisaK) {
//            System.out.println("Sekliniz Karedir");
//
//        } else {
//            System.out.println("Sekliniz Kare Degildir");
//        }

        char karakter;
        System.out.println("Lutfen Bir Karakter Giriniz :");
        karakter = scan.next().charAt(0);

        if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
            System.out.println("Bu Bir Harftir");
        } else {
            System.out.println("Bu Bir Harf Degildir");
        }
    }
}
