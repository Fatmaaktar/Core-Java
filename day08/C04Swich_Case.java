package day08;

import java.util.Scanner;

public class C04Swich_Case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gun;
        System.out.println("L�tfen Birden Yediye Kadar Rakam Giriniz :");
        gun = scan.nextInt();
        switch (gun) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("�ar�amba");
                break;
            case 4:
                System.out.println("Per�embe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("G�n De�ildir");
        }
    }
}
