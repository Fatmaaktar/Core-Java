package day08;

import java.util.Scanner;

public class C07Swich_Case {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char SDET;
        System.out.println("L�tfen SDET Kelimesinin Bir Harfini Giriniz :");
        SDET= scan.nextLine().charAt(0);

        switch (SDET){
            case 'S':
                System.out.println("Software");
                break;
            case 'C':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Enginner");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            default:
                System.out.println("SDET Kelimesinde B�yle Bir Harf Bulunmamaktad�r.");
        }

    }
}
