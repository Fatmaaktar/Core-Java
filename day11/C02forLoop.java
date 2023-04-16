package day11;

import java.util.Scanner;

public class C02forLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Yuzden Kucuk Bir Tamsayi Giriniz :");
        int sayi= scan.nextInt();
        for (int i=1;i<sayi;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
