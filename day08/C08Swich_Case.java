package day08;

import java.util.Scanner;

public class C08Swich_Case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gun;
        System.out.println("Lütfen Gün Giriniz");
        gun = scan.nextLine();
        System.out.println(gun.toUpperCase());

        switch (gun) {
            case"pazartesi":
                System.out.println( "haftaiçi");

                break;
            case "salý":
                System.out.println( "haftaiçi");

                break;
            case "çarþamba":
                System.out.println( "haftaiçi");

                break;
            case "perþembe":
                System.out.println( "haftaiçi");

                break;
            case "cuma":
                System.out.println( "haftaiçi");
                break;
            case "cumartesi" :
                System.out.println( "haftasonu");
                break;
            case "pazar":
                System.out.println( "haftasonu");
                break;
            default:
                System.out.println("Gün Deðildir");

        }
    }
}
