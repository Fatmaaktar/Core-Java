package day19;

import java.util.ArrayList;
import java.util.List;

public class C03Immutable {
    public static void main(String[] args) {
//        List<String>list=new ArrayList<String>();
//        list.add("one");
//        list.add("two");
//        for (String s:list) {
//            System.out.print(s);
//        }

        ArrayList<Integer>values=new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);

        for (Integer v:values) {
            System.out.println(v);
        }
    }
}
