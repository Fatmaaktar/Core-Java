package day08;

import java.util.Scanner;

public class C08Swich_Case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String gun;
        System.out.println("L�tfen G�n Giriniz");
        gun = scan.nextLine();
        System.out.println(gun.toUpperCase());

        switch (gun) {
            case"pazartesi":
                System.out.println( "haftai�i");

                break;
            case "sal�":
                System.out.println( "haftai�i");

                break;
            case "�ar�amba":
                System.out.println( "haftai�i");

                break;
            case "per�embe":
                System.out.println( "haftai�i");

                break;
            case "cuma":
                System.out.println( "haftai�i");
                break;
            case "cumartesi" :
                System.out.println( "haftasonu");
                break;
            case "pazar":
                System.out.println( "haftasonu");
                break;
            default:
                System.out.println("G�n De�ildir");

        }
    }
}
