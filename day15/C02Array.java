package day15;

import java.util.Arrays;

public class C02Array {
    public static void main(String[] args) {
        int arr[] = {3, 9, 7, 6, 1, 2, 25, 14, 8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 8));

        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 120));
    }
}
