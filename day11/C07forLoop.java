package day11;

import java.util.Scanner;

public class C07forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isim ;
        String tersi ="";
        System.out.println("Lutfen Bir Isim Giriniz :");
        isim= scan.nextLine();

        for (int i =isim.length()-1;i>=0; i--) {
            tersi=tersi+isim.substring(i,i+1);
        }
        if (isim.equals(tersi)) {
            System.out.println("Isim Tersi Ýle Aynýdýr");
        } else {
            System.out.println("Isim Tersi Ýle Ayný Degildir");
        }
    }
}
