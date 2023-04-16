package day11;

import java.util.Scanner;

public class C09forLoopOdev2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("Lutfen Ondan Kucuk Sayi Giriniz :");
        sayi = scan.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println("sonuc :" + faktoriyel);
    }
}
