package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01arrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
    list.add("A");
    list.add("C");
    list.add("E");
    list.add("F");
        System.out.println(list);
        list.set(3,"D");
        System.out.println(list.remove(3));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.contains("L"));
        System.out.println(list.contains("M"));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.isEmpty());

    }
}
