package day17;

public class ConstractorCall2 {
    int x = 3;
    int y = 5;

    ConstractorCall2() {
        x += 1;
        System.out.println("-x" + x);
    }

    ConstractorCall2(int i) {
        this();

        this.y = i;
        x += y;
        System.out.println("-x" + x);
    }

    ConstractorCall2(int i, int i2) {
        this(3);
        this.x -= 4;
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        ConstractorCall2 c1 = new ConstractorCall2(4, 3);
    }
}
