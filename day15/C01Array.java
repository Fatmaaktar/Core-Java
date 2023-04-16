package day15;

import java.util.Arrays;

public class C01Array {
    public static void main(String[] args) {
        int arr[]={3,9,7,6,1,2,25,14,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int temp=0;
        for (int i=0;i<arr.length/2;i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
