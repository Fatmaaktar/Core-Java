package day09;

import java.util.Scanner;

public class C01LastIndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String cumle;
//        char harf;
//        System.out.println("L�tfen Bir cumle Giriniz :");
//        cumle = scan.nextLine();
//        System.out.println("L�tfen Bir Harf Giriniz :");
//        harf = scan.nextLine().charAt(0);
//
//        System.out.println(cumle.lastIndexOf(harf));

        int count = 0;
        String cumle;
        String kelime;
        System.out.println("L�tfen Bir Cumle Giriniz :");
        cumle = scan.nextLine();
        System.out.println("L�tfen Bir Kelime Giriniz :");
        kelime = scan.nextLine();
        int ilk = cumle.lastIndexOf(kelime);
        while (ilk != -1) {
            count++;
            ilk = cumle.lastIndexOf(kelime, ilk - 1);
        }
        if (count == 0) {
            System.out.println("Hi� Kullan�lmad�");
        } else if (count == 1) {
            System.out.println("Bir Kez Kullan�ld�");
        } else {
            System.out.println("Birden Fazla Kez kullan�ld�");
        }


    }
}
