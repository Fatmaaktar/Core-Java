package day14;
public class C02ScopeStatic {
    static  int okulId;
    static  String okulIsmi;
    static  boolean acikMi;
    public static void main(String[] args) {
        System.out.println(okulId);
        System.out.println(okulIsmi);
        System.out.println(acikMi);
        C01ScopeInstance ins=new C01ScopeInstance();
        System.out.println(ins.ilkHarf);
        System.out.println(ins.isim);
        System.out.println(ins.ogrenciMi);
        System.out.println(ins.sayi);
    }
}
