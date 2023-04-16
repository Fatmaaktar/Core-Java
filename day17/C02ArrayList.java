package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02ArrayList {
    public static void main(String[] args) {
        String arr[]={"tavsan","serce"};
        List<String>list= Arrays.asList(arr);
        System.out.println(list.size());
        System.out.println(list);
        list.set(1,"test");
        System.out.println(Arrays.toString(arr));
        arr[0]="new";
        System.out.println(list);
    }
}
