package day05;

import java.util.Scanner;

public class C05if_else5 {
    public static void main(String[] args) {
        int not;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz :");
        not=scan.nextInt();

        if(not<50){
            System.out.println("D");
        }
        else if(not>=50 && not<60){
            System.out.println("C");
        }
        else if(not>=60 && not<80){
            System.out.println("B");
        }
        else if(not>=80){
            System.out.println("A");
        }else{
            System.out.println("Girdiginiz Not Gecersizdir.");
        }
    }
}
