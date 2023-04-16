package day05;

import java.util.Scanner;

public class C03if_else3 {
    public static void main(String[] args) {
        String gun;
        Scanner scan = new Scanner(System.in);

        System.out.println("Gun Ismini Giriniz :");
        gun = scan.nextLine().toLowerCase();


        if (gun.equals("pazartesi")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1, 3).toLowerCase());
        } else if (gun.equals("sali")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1, 3).toLowerCase());
        } else if (gun.equals("carsamba")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1, 3).toLowerCase());
        } else if (gun.equals("persembe")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1, 3).toLowerCase());
        } else if (gun.equals("cuma")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1, 3).toLowerCase());
        } else if (gun.equals("cumartesi")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1, 3).toLowerCase());
        } else if (gun.equals("pazar")) {
            System.out.println(gun.substring(0, 1).toUpperCase() + gun.substring(1, 3).toLowerCase());
        } else {
            System.out.println("Gecersiz Bir Gundur");
        }

    }
}
