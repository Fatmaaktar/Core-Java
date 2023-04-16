package day14;

public class C01ScopeInstance {
    int sayi;
    char ilkHarf;
    String isim;
    boolean ogrenciMi;
    public static void main(String[] args) {
        C01ScopeInstance exemple = new C01ScopeInstance();
        C01ScopeInstance exemple2= new C01ScopeInstance();
        C01ScopeInstance exemple3= new C01ScopeInstance();
//        System.out.println(exemple.sayi);
//        System.out.println(exemple.ilkHarf);
//        System.out.println(exemple.ogrenciMi);
//        System.out.println(exemple.isim);
//        System.out.println(C02ScopeStatic.okulId);
//        System.out.println(C02ScopeStatic.okulIsmi);
//        System.out.println(C02ScopeStatic.acikMi);

        System.out.println(exemple.isim = "Suat");
        System.out.println(exemple2.isim = "Fatma");
        System.out.println(exemple3.isim = "Pýnar");
    }
}
