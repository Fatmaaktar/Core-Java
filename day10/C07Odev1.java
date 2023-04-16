package day10;

import java.util.Scanner;

public class C07Odev1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre;
        System.out.println("Lutfen Sifrenizi Giriniz :");
        sifre = scan.nextLine();
        boolean buyukMu=sifre.charAt(0)>='A'&&sifre.charAt(0)<='Z';
        boolean kucukMu=sifre.charAt(sifre.length()-1)>='a'&&sifre.charAt(sifre.length()-1)<='z';
        boolean uzunluk=sifre.length()>=8;
        boolean boslukVarMi=!sifre.contains(" ");

        if (buyukMu&&kucukMu&&uzunluk&&boslukVarMi){
            System.out.println("Sifre Basari Ile Tamamlandi ");
        }else{
            System.out.println("Yanlis veya Eksik Sifre");
        }


    }
}
