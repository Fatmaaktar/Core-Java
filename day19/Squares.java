package day19;

public class Squares {
   public static long square(int x){
       long y=x*x;
       x=-1;
       return y;
   }

    public static void main(String[] args) {
        int value=9;
        long result=square(value);
        System.out.println(value);
    }

}
