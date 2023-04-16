package day10;

public class C01StringManipulation {
    public static void main(String[] args) {
        String str="Calismak Basarmanin Yarisidir";
//        System.out.println(str.endsWith("r"));//true
//        System.out.println(str.endsWith("t"));//false
//        System.out.println(str.endsWith("dir"));//true
//
//        System.out.println(str.startsWith("C"));
//        System.out.println(str.startsWith("Calis"));
//        System.out.println(str.startsWith("s",4));
//        System.out.println(str.startsWith("Yarisi",20));

        System.out.println(str.isEmpty());
        String str2="";
        System.out.println(str2.isEmpty());
        String str3=null;
        System.out.println(str3.isEmpty());//hata :Cannot invoke "String.isEmpty()" because "str3" is null
    }
}
