package day17;

public class C05forEachLoop {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int carpim=1;
        for (int i:arr){
            carpim*=i;
        }System.out.println("Carpým :"+carpim);
    }
}
