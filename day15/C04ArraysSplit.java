package day15;

import java.util.Arrays;

public class C04ArraysSplit {
    public static void main(String[] args) {
        String str = "Java Ogrenmek, IT alaninda yer edinmek demektir.";
        String arr[] = str.split(",");
        System.out.println(Arrays.toString(arr));

        String arr2[] = str.replaceAll(" ", "").split(" ");
        System.out.println(Arrays.toString(arr2));

        String arr3[] = str.split("");
        System.out.println(Arrays.toString(arr3));

    }
}
