package day17;

public class C09Car {
    int ilanNo;
    String marka;
    String model;
    int yil;
    int fiyat;

    public static void main(String[] args) {

    }

    public C09Car() {


    }

    public C09Car(int ilanNo) {
        this.ilanNo = ilanNo;
    }

    public C09Car(int ilanNo, String marka, String model, int yil, int fiyat) {
        this.ilanNo = ilanNo;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public void hiz(int maxHiz) {
        System.out.println("Araba max. " + maxHiz + " km hiz yapar");
    }

    public void yakit(String yakitTuru) {
        System.out.println("Araba yakit olarak " + yakitTuru + " kullanir");
    }
}
