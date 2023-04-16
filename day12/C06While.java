package day12;

import java.util.Scanner;

public class C06While {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int rakam;
        System.out.println("Lutfen Bir Rakam Giriniz :");
        rakam= scan.nextInt();
        int i=1;

        while (i<=10){
            System.out.println(rakam+"*"+i+"="+(rakam*i)+" " );
            i++;

        }
    }
}
