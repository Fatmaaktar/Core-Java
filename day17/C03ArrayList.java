package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03ArrayList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("tavsan");
        list.add("horoz");
        Object arr[]=list.toArray();
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
