package day16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04arrayToplam {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int toplam = 0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            arr2[i] = toplam;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
