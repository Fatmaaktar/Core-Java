package day08;

import java.util.Scanner;

public class C06Swich_Case {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi;
        System.out.println("Lütfen Yandaki Sayilardan Bir Sayý Giriniz :"+10+" "+100+" "+1000);
        sayi= scan.nextInt();
        switch (sayi){
            case 10:
                System.out.println("Ýki Basamalý En Küçük Sayý");
                break;
            case 100:
                System.out.println("Üç Basamalý En Küçük Sayý");
                break;
            case 1000:
                System.out.println("Dört Basamalý En Küçük Sayý");
                break;
            default:
                System.out.println("Sizden Ýstenilmeyen Sayý Girdiniz");
        }
    }
}
