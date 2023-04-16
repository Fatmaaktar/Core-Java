package day10;

public class C02StringManipulation {
    public static void main(String[] args) {
        //       String str="Java Ogrenmek Cok Kolay";
//        System.out.println(str.replace("a","x"));//Jxvx Ogrenmek Cok Kolxy
//        System.out.println(str.replace("Java","x"));//x Ogrenmek Cok Kolay
//        System.out.println(str.replace("a","xxx"));//Jxxxvxxx Ogrenmek Cok Kolxxxy
//        System.out.println(str.replace("a",""));//Jv Ogrenmek Cok Koly
//        System.out.println(str.replace('a','x'));//Jxvx Ogrenmek Cok Kolxy

        String str = "Java'da rakamlar 1234567890";
        System.out.println(str);

        System.out.println(str.replaceAll("a","*"));//J*v*'d* r*k*ml*r 1234567890
        System.out.println(str.replaceAll("\\s","*"));//Java'da*rakamlar*1234567890
        System.out.println(str.replaceAll("\\S","*"));//******* ******** **********
        System.out.println(str.replaceAll("\\w","*"));//****'** ******** **********
        System.out.println(str.replaceAll("\\W","*"));//Java*da*rakamlar*1234567890
        System.out.println(str.replaceAll("\\d",""));//Java'da rakamlar **********
        System.out.println(str.replaceAll("\\D","*"));//*****************1234567890

//            System.out.println(str.replaceFirst("a","*"));//J*va'da rakamlar 1234567890
//          System.out.println(str.replaceFirst("lar","*"));//Java'da rakam* 1234567890
//        System.out.println(str.replaceFirst("\\s","*"));//Java'da*rakamlar 1234567890
//        System.out.println(str.replaceFirst("\\D","*"));//*ava'da rakamlar 1234567890


    }
}
