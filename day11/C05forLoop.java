package day11;

import java.util.Scanner;

public class C05forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String metin;
        System.out.println("Lutfen Bir Metin Giriniz :");
        metin = scan.nextLine();

        for (int i = metin.length()-1;i>=0; i--) {
            System.out.print(metin.substring(i,i+1));

        }


    }
}
