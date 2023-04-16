package day18;

public class Deneme2 {
    int x;
    static int y;
    Deneme2(int i){
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {
        new Deneme2(2);
        Deneme2 dnm=new Deneme2(3);
        System.out.println(dnm.x +","+ y);
    }
}
