package day10;

import java.util.Scanner;

public class C06String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kelime;
        String tersKelime = "";
        System.out.println("Lutfen Bir Kelime Giriniz :");
        kelime = scan.nextLine();

        for (int i = 0; i < kelime.length(); i++) {
            tersKelime += kelime.substring(kelime.length() - 1 - i, kelime.length() - i);
        }
        System.out.println(tersKelime);
    }
}
