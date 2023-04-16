package day12;

import java.util.Scanner;

public class C07While {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("Lutfen Bir Rakam Giriniz :");
        sayi = scan.nextInt();
        int bolenSayi = 0;
        for (int i = 2; i <=sayi; i++) {
            while (sayi%i==0) {
                System.out.println(i+" ");
                bolenSayi++;
                i++;
            }
        }
        System.out.println("Bolen Sayisi :"+bolenSayi);
    }
}