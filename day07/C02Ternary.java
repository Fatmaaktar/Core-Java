package day07;

import java.util.Scanner;

public class C02Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int x;
//        int y;
//        System.out.println("Lutfen ilk Say�y� Giriniz :");
//        x= scan.nextInt();
//        System.out.println("Lutfen Ikinci Sayiyi Giriniz :");
//        y= scan.nextInt();
//        System.out.println(x<y ? ("X Kucuk sayidir"):("Y Kucuk Sayidir"));
//
//        System.out.println("Lutfen Bir Say� Giriniz :");
//        x = scan.nextInt();
//        System.out.println((x < 0 )  ? ("Mutlak De�eri :"+ -x ): ("say� :"+ x));

//        System.out.println("Lutfen Bir Say� Giriniz :");
//        int  x = scan.nextInt();
//        System.out.println(x>0 ? ("Say� Pozitiftir"):("Say�n�n Karesi :" + x*x));

        System.out.println("Lutfen Bir Say� Giriniz :");
        int  x = scan.nextInt();
        System.out.println(x<10 ? ("Rakam"):(x<100 ?("Iki Basamakl� Say�"):("�� Basamakl� Say�")) );
    }

}
