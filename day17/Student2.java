package day17;

public class Student2 {
    String name;
    int ago;
    String phone;

    Student2() {

    }

    Student2(String name, int ago, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("John", 25, "029-25520148");
        System.out.println(s2.name + "," + s2.ago + "," + s2.phone);
    }

}
