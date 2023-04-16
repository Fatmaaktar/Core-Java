package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08arrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        System.out.println(list.equals(list2));
        list.add("a");
        System.out.println(list.equals(list2));
        list2.add("a");
        System.out.println(list.equals(list2));
        list2.add(0,"b");
        System.out.println(list.equals(list2));
        Collections.sort(list);
        Collections.sort(list2);
        System.out.println(list.equals(list2));

    }
}
