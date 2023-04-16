package day11;

import java.util.Scanner;

public class C08forLoopOdev1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2;
        int toplam=0;
        System.out.println("Lutfen Bir Sayi Giriniz :");
        number1 = scan.nextInt();
        System.out.println("Lutfen Bir Sayi Daha Giriniz :");
        number2 = scan.nextInt();

        if (number1 <= number2) {
            for (int i = number1; i <= number2; i++) {
                toplam +=i;
            }
        } else {
            for (int i = number2; i <= number1; i++) {
                toplam +=i;
            }

        }
        System.out.println("Toplam :"+toplam);
    }
}
