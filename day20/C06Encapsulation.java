package day20;

public class C06Encapsulation {
    public static void main(String[] args) {
        C06Setter obj=new C06Setter();
        System.out.println(obj.getSayi());
        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());
        System.out.println(obj.toString());
    }


}
