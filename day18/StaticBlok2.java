package day18;

public class StaticBlok2 {
    public static void main(String[] args) {
        int fiyat = 100;
        System.out.println("Metodda hesaplanan deger :" + indirim(fiyat));
        System.out.println("Metodda call sonrasi fiyat :" + (fiyat));
    }
    private static int indirim(int fiyat){
        fiyat*=0.90;
        return fiyat;
    }
}
