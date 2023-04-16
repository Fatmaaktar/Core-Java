package day19;

public class C01Immutable {
    public static void main(String[] args) {
        String str1 = new String("mehmet");
        String str2 = new String("mehmet");

        System.out.println("new == " + (str1 == str2));
        System.out.println("new equals " + (str1.equals(str2)));

        String str3 = "mehmet";
        String str4 = "mehmet";

        System.out.println("klasik == " + (str3 == str4));
        System.out.println("klasik equals " + (str3.equals(str4)));
    }
}
