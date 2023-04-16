package day06;
import java.util.Scanner;
public class C08Odev2 {
    public static void main(String[] args) {
       int password;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Dort Basamakli Bir Sifre Giriniz :");
        password= scan.nextInt();

        if(password%5==0){
            if(password%10==0){
                System.out.println("Bese Bolunen Cift Sayidir");
            }
            else System.out.println("Tekrar Deneyiniz");
        }else if(password%10==0) {
            System.out.println("Bese Bolunen tek Sayidir");
        }

        else System.out.println("Tekrar Deneyiniz");
    }
}
