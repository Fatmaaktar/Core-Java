package day10;

import java.util.Scanner;

public class C04String {
    public static void main(String[] args) {
//        String str = " Java ogrenmek123 Cok guzel@";
//        System.out.println(str.replaceAll("\\d", "").replaceAll("@", ""));
//
//        String str1="$13.99";
//        String str2="$10.55";
//
//        System.out.println(Double.parseDouble(str1.replace("$",""))+Double.parseDouble(str2.replace("$","")));
        Scanner scan= new Scanner(System.in);
        String isim;
        System.out.println("Lütfen Ýsminizi Giriniz :");
        isim= scan.nextLine();
        String aHarfi="a";
        String zHarfi="Z";


        if(isim.contains(aHarfi)){
            System.out.println("Isminiz a harfi iceryor");
        }else if(isim.contains(zHarfi)){
            System.out.println("Isminiz z harfi iceryor");
        }else{
            System.out.println("Isminiz a yada z harfi icermiyor");
        }
    }
}
