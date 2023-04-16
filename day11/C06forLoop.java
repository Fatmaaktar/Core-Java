package day11;

import java.util.Scanner;

public class C06forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Kelime Giriniz :");
        String kelime= scan.nextLine();
        tersKelime(kelime);
    }

    private static void tersKelime(String kelime) {
        for (int i = kelime.length()-1;i>=0; i--) {
            System.out.print(kelime.substring(i,i+1));
        }
    }
}
