package day12;

import java.util.Scanner;

public class C01NestedFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("Lutfen Bir Sayi Giriniz :");
        sayi= scan.nextInt();

        for (int i=0;i<sayi;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
