package day15;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
        int arr1[]={2,1,7,6};
        int arr2[]={7,1,6,2};
        System.out.println(Arrays.equals(arr1,arr2));

        int arr3[]={3,2,7,8,11};
        int arr4[]={7,3,8,2,12};
        Arrays.sort(arr3);
        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4));

        int arr5[]={4,2,6,8,11};
        int arr6[]={11,4,8,2,6};
        Arrays.sort(arr5);
        Arrays.sort(arr6);
        System.out.println(Arrays.equals(arr5,arr6));
    }
}
