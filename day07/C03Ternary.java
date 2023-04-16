package day07;

import java.util.Scanner;

public class C03Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        char harf;
//        System.out.println("Lütfen Bir Harf Giriniz :");
//        harf = scan.nextLine().charAt(0);
//
//        System.out.println(harf >= 'a' && harf <= 'z' ? ("Kucuk Harftir") :
//                (harf >= 'A' && harf <= 'Z' ? "Buyuk Harftir" : "Girdiðiniz Karakter harf Deðil"));

        int kisaK, uzunK;
        System.out.println("Lütfen Dortgenin Geniþliðini Giriniz :");
        uzunK = scan.nextInt();
        System.out.println("Lütfen Dortgenin Yüksekliðini Giriniz :");
        kisaK = scan.nextInt();

        System.out.println(kisaK == uzunK ? ("Dortgeniniz Karedir") : ("Dortgeniniz Dikdortgendir"));
    }
}
