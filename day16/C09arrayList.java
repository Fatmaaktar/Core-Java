package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09arrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("yilan");
        list.add("kedi");

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        list.clear();
        System.out.println(list.isEmpty());

        System.out.println(list.size());

    }
}
