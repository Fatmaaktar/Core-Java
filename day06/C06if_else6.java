package day06;

import java.util.Scanner;

public class C06if_else6 {
    public static void main(String[] args) {
        double maasTeklif;
        Scanner scan = new Scanner(System.in);
        System.out.println("Maas Teklifinizi Yaziniz :");
        maasTeklif=scan.nextDouble();

        if(maasTeklif>80000){
            System.out.println("Kabul Ediyorum.");
        }
        else if((maasTeklif<=80000)&& (maasTeklif>60000)){
            System.out.println("Konusabiliriz.");
        }
        else {
            System.out.println("Maalesef Kabul Edemem.");
        }
    }
}
