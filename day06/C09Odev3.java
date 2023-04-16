package day06;
import java.util.Scanner;
public class C09Odev3 {
    public static void main(String[] args) {
        int yil;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Yil Giriniz :");
        yil=scan.nextInt();

        if(yil%4==0){
            if(yil%100!=0){
                System.out.println("Artik Yildir");
            }
        } if (yil%400==0){
            System.out.println("Artik Yildir");
        }else
            System.out.println("Artik Yil Degildir");
    }
}
