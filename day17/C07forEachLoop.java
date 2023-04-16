package day17;

import java.util.ArrayList;
import java.util.List;

public class C07forEachLoop {
    public static void main(String[] args) {
        String arr[]={"A","B","C","D","E"};
        String arr2[]={"F","K","A","E","M"};
        List<String> ortakList=new ArrayList<String>();

        for (String i:arr) {
            for (String j:arr2){
                if(i.equals(j)){
                    ortakList.add(j);
                }
            }
        }   if (ortakList.isEmpty()){
            System.out.println(("Ortak Eleman Yok!!!"));
        } else {
            System.out.println(ortakList);
        }

    }
}
