package day09;
import java.util.Scanner;
public class C03Contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cumle;
        String kucuk="k���k";
        String buyuk="b�y�k";

        System.out.println("L�tfen Bir Cumle Giriniz :");
        cumle= scan.nextLine();
        if(cumle.contains(buyuk)){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains(kucuk)){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("Cumle Buyuk Ya Da Kucuk Kelimesini �cermiyor");
        }
    }
}
