package day17;

public class C10Car2 {
    public static void main(String[] args) {
        C09Car car1=new C09Car();
        car1.ilanNo=1234;
        car1.marka="Toyota";
        car1.model="Corolla";
        car1.yil=2010;
        car1.fiyat=50000;

        C09Car car2=new C09Car(2929,"Honda","Civic",2020,57000);
        C09Car car3=new C09Car(2929,"Honda","City",2021,58000);


        System.out.println(car1.ilanNo+", "+car1.marka+", "+car1.model+", "+car1.yil+", "+ car1.fiyat);
        car1.hiz(150);
        car1.yakit("Benzin");
    }
}
