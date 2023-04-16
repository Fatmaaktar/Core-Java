package day17;

public class C08forEachLoop {
    public static void main(String[] args) {
        String metin="JavaGuzeldir";
        String arr[]=metin.split("");
        for (String i:arr) {
            System.out.print(i+" ");
        }
    }
}
