package day12;

import java.util.Scanner;

public class C02NestedFor {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int rakam;
        System.out.println("Lutfen Bir Rakam Giriniz :");
        rakam= scan.nextInt();

        for (int i=1;i<=rakam;i++){
            for (int j=1;j<=rakam;j++){
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
