package day16;
import java.util.Scanner;

public class C05arrayString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Cumle Giriniz :");
        String cumle = scan.nextLine();
        String[] arr =cumle.split(" ");
        System.out.println(arr.length);
    }
}
