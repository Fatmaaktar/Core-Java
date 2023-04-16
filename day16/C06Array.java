package day16;

import java.util.Arrays;
import java.util.Scanner;

public class C06Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deger;
        System.out.println("Lutfen Bir Deger Giriniz :");
        deger = scan.nextInt();
        int j = 0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int arr2[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (deger != arr[i]) {
                arr2[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));

    }
}
