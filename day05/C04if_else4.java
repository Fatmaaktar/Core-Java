package day05;
import java.util.Scanner;
public class C04if_else4 {
    public static void main(String[] args) {
        int sayi1, sayi2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz :");
        sayi1 = scan.nextInt();
        System.out.println("Ikinci Sayiyi Giriniz :");
        sayi2 = scan.nextInt();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(sayi1 * sayi2);
        } else if ((sayi1 > 0 && sayi2 < 0) || (sayi1 < 0 && sayi2 > 0)) {
            System.out.println("Farkli Isarette sayilar");
        } else if ((sayi1 == 0) || (sayi2 == 0)) {
            System.out.println("Sifir Carpmaya Gore Yutan Elemandir");
        }

    }
}
