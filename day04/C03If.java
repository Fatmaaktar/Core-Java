package day04;
import java.util.Locale;
import java.util.Scanner;

public class C03If {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//        System.out.println("Lutfen Bir Sayi Giriniz :");
//        int sayi= scan.nextInt();
//
//        if(sayi % 2==0){
//            System.out.println("Sayi Cifttir");
//        }
//        if(sayi % 2==1){
//            System.out.println("Sayi Tektir");
//        }


//        System.out.println("Lütfen Bir Gunun Bas Harfini Giriniz :");
//        String BasHarf=scan.nextLine().toUpperCase();
//
//        if(BasHarf.equals("P")){
//            System.out.println("Pazartesi,Persembe,Pazar");
//
//        }
//        if(BasHarf.equals("C")){
//            System.out.println("Cuma,Cumartesi");
//
//        }
//        if(BasHarf.equals("S")){
//            System.out.println("Sali");
//
//        }
//        System.out.println("Lutfen Gun Giriniz :");
//        String gun= scan.nextLine().toLowerCase();
//
//        if(gun.equals("pazar")||gun.equals("cumartesi")){
//            System.out.println("Haftasonu");
//        }
//        if(!gun.equals("pazar")&&!gun.equals("cumartesi")){
//            System.out.println("Haftaici");
//        }
//        int kisaK;
//        int uzunK;
//
//        System.out.println("Kisa Kenarı Giriniz :");
//        kisaK= scan.nextInt();
//
//        System.out.println("Uzun Kenarı Giriniz :");
//        uzunK= scan.nextInt();
//
//        if(uzunK==kisaK){
//            System.out.println("Sekliniz Karedir");
//
//        }
//        if(uzunK!=kisaK){
//            System.out.println("Sekliniz Dikdortgendir");
//
//        }
        String gun;
        System.out.println("Lutfen Gun Giriniz");
        gun=scan.nextLine().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin Kutsal Gun");
        }
        if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin Kutsal Gun");
        }
        if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin Kutsal Gun");
        }

    }
}
