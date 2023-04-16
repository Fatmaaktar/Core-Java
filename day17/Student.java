package day17;

public class Student {
    String name="Emily";
    int ago=20;

    Student(String name,int ago){
        this.name=name;
        this.ago=22;
    }

    public static void main(String[] args) {
        Student st=new Student("Oliver",21);
        System.out.print(st.name);
        System.out.print(", "+st.ago);
    }
}
