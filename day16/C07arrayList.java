package day16;

import java.util.ArrayList;
import java.util.List;

public class C07arrayList {
    public static void main(String[] args) {
        List<String> hayvan=new ArrayList<>();
//        System.out.println(hayvan.isEmpty());
        hayvan.add("Kedi");
        System.out.println(hayvan);
//        System.out.println(hayvan.size());
        hayvan.add("Yilan");
        System.out.println(hayvan);
//        System.out.println(hayvan.size());
        hayvan.add(1,"Kartal");
        System.out.println(hayvan);
//        System.out.println(hayvan.size());
        hayvan.add(0,"Sinek");
        System.out.println(hayvan);
//        System.out.println(hayvan.size());
        hayvan.add(1,"Aslan");
        System.out.println(hayvan);
//        System.out.println(hayvan.size());
        System.out.println(hayvan.remove(1));
        System.out.println(hayvan);
        System.out.println(hayvan.remove("Kartal"));
        System.out.println(hayvan.remove("tavsan"));
        System.out.println(hayvan);
        hayvan.set(1,"Tavsan");
        System.out.println(hayvan);
        System.out.println(hayvan.get(0));
        System.out.println(hayvan.get(1));
        System.out.println(hayvan.get(2));
        System.out.println(hayvan.contains("Kedi"));
        System.out.println(hayvan.contains("Yilan"));
    }
}
