package day16;

public class C03ArrayToplami {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length < arr2[i].length) {

                for (int j = 0; j < arr[i].length; j++) {
                    System.out.println(arr[i][j] + arr2[i][j]);
                }
            } else {
                for (int j = 0; j < arr2[i].length; j++) {
                    System.out.println(arr[i][j] + arr2[i][j]);
                }
            }
        }
    }
}
