package day08;

import java.util.Scanner;

public class C06Swich_Case {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi;
        System.out.println("L�tfen Yandaki Sayilardan Bir Say� Giriniz :"+10+" "+100+" "+1000);
        sayi= scan.nextInt();
        switch (sayi){
            case 10:
                System.out.println("�ki Basamal� En K���k Say�");
                break;
            case 100:
                System.out.println("�� Basamal� En K���k Say�");
                break;
            case 1000:
                System.out.println("D�rt Basamal� En K���k Say�");
                break;
            default:
                System.out.println("Sizden �stenilmeyen Say� Girdiniz");
        }
    }
}
