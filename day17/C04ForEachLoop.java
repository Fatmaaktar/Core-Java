package day17;

import java.util.ArrayList;
import java.util.List;

public class C04ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {12, 13, 14, 44};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        for (String j : list) {
            System.out.print(j + " ");
        }

    }
}
