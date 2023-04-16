package day19;

import java.time.LocalDateTime;

public class C06Date {
    public static void main(String[] args) {
        LocalDateTime dateTime1=LocalDateTime.now();
        System.out.println(dateTime1);

        String dt=dateTime1.toString();
        System.out.println(dt.startsWith("2021"));
    }
}
