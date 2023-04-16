package day05;

import java.util.Scanner;

public class C02if_else2 {
    public static void main(String[] args) {
        int yas;
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen Yasinizi Giriniz :");
        yas=scan.nextInt();

        if (yas<65) {
            System.out.println("Emekli Olamazsin,Clismalisin");
        }
        if (yas>=65) {
            System.out.println("Emekli Olabilirsin");
        }
    }
}
