package day03;

import java.util.Scanner;

public class C05Mod {
    public static void main(String[] args) {
//        int a = 15 % 4;
//        System.out.println(a);

        int sayi;
        int mod = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz :");
        sayi = scan.nextInt();

        while (sayi>0){
            mod = mod + sayi % 10;
            sayi = sayi / 10;

        }
        System.out.println("Modilius = " + mod);

    }
}
