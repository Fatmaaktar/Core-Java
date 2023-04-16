package day10;

import java.util.Scanner;

public class C08Odev2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Ismminizi Giriniz :");
        String isim= scan.nextLine();
        System.out.println("Lutfen Soyisminizi Giriniz :");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen Kredi Kart Numaranizi Giriniz : ");
        String kullaniciBilgisi= scan.nextLine();

      String ad=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
      String soyad=soyisim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
      String kart=kullaniciBilgisi.substring(0,15).replaceAll("\\d","*")+kullaniciBilgisi.substring(15);
        System.out.println(ad+" "+soyad);
        System.out.println(kart);

    }
}
