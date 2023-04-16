package day10;

import java.util.Scanner;

public class C05String {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String isim, soyisim;
        System.out.println("Lütfen Isminizi Giriniz :");
        isim= scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz :");
        soyisim= scan.nextLine();

        if(isim.length()>soyisim.length()){
            System.out.println("Isminiz Soyisminizden Daha Uzun Karakterlidir");
        }else if(isim.length()==soyisim.length()){
            System.out.println("Isminiz ve Soyisminiz esit Karakterlidir");
        }else{
            System.out.println("Soyisminiz isminizden Daha Uzun Karakterlidir");
        }
    }
}
