package day2;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        double yaricap;
        int uzunK, kisaK,yukseklik;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Çemberin Yarıçapını Girirniz :");
        yaricap=scan.nextDouble();

        System.out.println("Çevre: "+(2*yaricap)*3.14);
        System.out.println("Daireinin Alanı :"+(yaricap*yaricap)*3.14);

        System.out.println("-------------------------------------");

        System.out.println("Uzun Kenarı Giriniz :");
        uzunK=scan.nextInt();

        System.out.println("Kısa Kenarı Giriniz :");
        kisaK=scan.nextInt();

        System.out.println("Yüksekliği Giriniz :");
        yukseklik=scan.nextInt();

        System.out.println("Prizmanın Hacmi :"+(uzunK*kisaK)*yukseklik);

        //dört işlem--------------------------------------------------------------->
//
//        int sayi1, sayi2, islem;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Birinci Sayıyı Giriniz :");
//        sayi1 = scan.nextInt();
//
//        System.out.println("İkinci Sayıyı Giriniz :");
//        sayi2 = scan.nextInt();
//
//        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Giriniz :");
//        islem= scan.nextInt();
//
//        if(islem==0){
//            System.out.println("Toplama Sonucu :"+(sayi1+sayi2));
//        }else if(islem==1){
//            System.out.println("Çıkartma Sonucu :" +(sayi1-sayi2));
//        }else if(islem==2){
//            System.out.println("Çarpma Sonucu :"+(sayi1*sayi2));
//        }else if(islem==3){
//            System.out.println("Bölme Sonucu :"+(sayi1/sayi2));
//        }else{
//            System.out.println("Böyle Bir İşlem Bulıunmamaktadır.");
//        }



    }
}
