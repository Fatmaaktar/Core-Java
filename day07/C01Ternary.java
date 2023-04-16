package day07;

public class C01Ternary {
    public static void main(String[] args) {
        int y = 112;
        int x = 1;
        int z = 1;

        System.out.println((y > 5) ? ("Inek") : ("Koyun"));
        System.out.println((y < 9) ? 9 : 11);
        int a = x < 10 ? x++ : z++;
        System.out.println(x + "," + z + "," + a);

    }
}
