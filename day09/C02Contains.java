package day09;

import java.util.Scanner;

public class C02Contains {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String email;
        String mail="@gmail.com";
        System.out.println("L�tfen Email Giriniz :");
        email=scan.nextLine();
        if(email.contains(mail)){
            System.out.println("E_mail kaydedildi");
        }else if(!(email.contains(mail))){
            System.out.println("Yanl�� E_mail Girdiniz");
        }
    }
}
