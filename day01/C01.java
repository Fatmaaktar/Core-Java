package day01;

import java.util.Scanner;

public class C03 {

    public static void main(String[] args) {
        String isim,soyisim;
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz :");
        isim=scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz :");
        soyisim=scan.nextLine();

        System.out.println("İsminiz :"+isim);
        System.out.println("Soyisminiz :"+soyisim);

        System.out.println("----------------------------");
        System.out.println(isim.substring(0,1));

    }
}
