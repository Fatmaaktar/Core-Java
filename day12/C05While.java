package day12;

import java.util.Scanner;

public class C05While {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char harf1;
        char harf2;
        System.out.println("Lutfen Birinci Harfi Giriniz :");
        harf1=scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Lutfen Ikinci Harfi Giriniz :");
        harf2=scan.nextLine().toUpperCase().charAt(0);
           while (harf1<=harf2){
               System.out.println(harf1);
               harf1++;
           }
    }
}
