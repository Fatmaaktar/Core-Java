package day07;

import java.util.Scanner;

public class C04Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("L�tfen Bir Say� Giriniz :");
        sayi = scan.nextInt();

        System.out.println(sayi >= 100 && sayi <= 999 ? ("Say� �� Basamakl�d�r") : ("Say� �� Basamakl� De�ildir"));
    }
}
