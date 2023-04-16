package day17;

public class C06forEachLoop {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};//karelerin toplamý
        int toplam=0;
        int kare=1;
        for (int i:arr) {
            kare=i*i;
            toplam+=kare;
        }
        System.out.println("Sonuc :"+toplam);
    }
}
