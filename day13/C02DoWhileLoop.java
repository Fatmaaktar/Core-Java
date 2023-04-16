package day13;

import java.util.Scanner;

public class C02DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre;
        boolean flagB = false;
        boolean flagK = false;
        boolean flagS = false;
        boolean flag = true;
        System.out.println("lutfen Bir Sifre Giriniz :");
        sifre = scan.nextLine();

        do {
            do {
                for (int i = 0; i < sifre.length(); i++) {
                    if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                        flagB = true;
                        i = sifre.length();
                    }
                }
                if (flagB!=true){
                    System.out.println("Buyuk Harf Barindirmali!");
                }

            } while (flag != true);
            do {
                for (int i = 0; i < sifre.length(); i++) {
                    if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                        flagK = true;
                        i = sifre.length();
                    }
                }
                if (flagK!=true){
                    System.out.println("Kucuk Harf Barindirmali!");
                }

            } while (flag != true);
            do {
                for (int i = 0; i < sifre.length(); i++) {
                    if (sifre.charAt(i) >= '!' && sifre.charAt(i) <= '/') {
                        flagS = true;
                        i = sifre.length();
                    }
                }
                if (flagS!=true){
                    System.out.println("Sembol Barindirmali!");
                }

            } while (flag != true);

        } while (flag != true);
        if (flagB == true && flagK == true && flagS && true) {
            System.out.println("Sifreniz Uygundur");
        }
        System.out.println("Girdiginiz Sifre :" + sifre);

    }
}
