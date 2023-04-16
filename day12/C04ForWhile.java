package day12;

public class C04ForWhile {
    public static void main(String[] args) {
            for (int i=100;i<1000;i++) {
                while (i%15==0&&i%20==0&&i%90==0) {
                    System.out.println(i);
                   i++;
                }
            }

    }
}
