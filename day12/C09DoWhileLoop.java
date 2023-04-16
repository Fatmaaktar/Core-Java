package day12;

public class C09DoWhileLoop {
    public static void main(String[] args) {
        int i=9;
        do
        {
            if(i%7==0){
                System.out.println(i);
            }  i++;
        }while(i<=190);
    }
}
