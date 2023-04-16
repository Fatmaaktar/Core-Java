package day16;

import java.util.Arrays;

public class C01ArrayCarpma {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6}};
        int carpim=1;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                carpim*=arr[i][j];
            }

        }
        System.out.println("Sonuc :"+carpim);
    }
}
