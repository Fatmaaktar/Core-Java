package day14;

import java.util.Arrays;

public class C04Arrays {
    public static void main(String[] args) {
//        String myArray[]=new String[4];
//        myArray[0]="Ali";
//        myArray[1]="Veli";
//        myArray[2]="Pýnar";
//        myArray[3]="Fatma";

//        String myArray[]={"Ali","Veli","Pinar","Fatma"};
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(myArray[0]);
//        myArray[0]="Can";
//        myArray[2]="Gul";
//        System.out.println(Arrays.toString(myArray));
//        System.out.println(myArray.length);
//        int says=myArray.length;

//
//        int myArray[]={9,10,11};
//
//        for (int i=0;i< myArray.length;i++){
//            System.out.println(myArray[i]);
//        }
//        System.out.println(Arrays.toString(myArray));

//
//        int myArray[] = {1, 2, 3};
//        int temp = myArray[0];
//        for (int i = 0; i < myArray.length; i++) {
//            if ( i < myArray.length - 1){
//                myArray[i] = myArray[i + 1];
//            }else myArray[i] = temp;
//        }
//        System.out.println(Arrays.toString(myArray));


        int myArray[] = {1, 2, 3, 4, 5, 6};
        int toplam = 0;
        for (int i = 0; i < myArray.length; i++) {

            toplam += myArray[i];
        }
        System.out.println("Toplam :" +toplam);

    }
}
