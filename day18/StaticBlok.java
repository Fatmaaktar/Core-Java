package day18;

public class StaticBlok {
    public static int age;
    static {
        System.out.println("Statik blok 2 calisti");
        age=24;
    }
    static {
        System.out.println("Statik blok 1 calisti");
        age=23;
    }
    public StaticBlok(){
        System.out.println("Constractor Calisti");
        System.out.println(++age);
    }

    public static void main(String[] args) {
        System.out.println("Main metod calisti 1");
        System.out.println(++age);
        StaticBlok obj=new StaticBlok();
        System.out.println("Main metod calisti 2");
    }
}
