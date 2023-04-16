package day20;

public class CStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("Mehmet ");
        System.out.println(sb);
        sb.append("Hoca ");
        System.out.println(sb);
        sb.append("Java ").append("anlatir ");
        System.out.println(sb);
        sb.append("Java cok guzel ", 0, 4);
        System.out.println(sb);
        System.out.println(sb.charAt(5));
        System.out.println(sb.delete(4,7));
        System.out.println(sb.deleteCharAt(3));


    }

}
