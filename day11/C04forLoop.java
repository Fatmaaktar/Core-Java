package day11;

import java.util.Scanner;

public class C04forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Yuzden Kucuk Bir SayÝ Giriniz :");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Java Guzeldir");
            } else if (i % 5 == 0) {
                System.out.println("Guzeldir");
            } else if (i % 3 == 0) {
                System.out.println("Java");
            } else {
                System.out.println(i);
            }
        }
    }
}
