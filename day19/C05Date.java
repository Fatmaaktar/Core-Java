package day19;

import java.time.LocalTime;
import java.time.ZoneId;

public class C05Date {
    public static void main(String[] args) {
        LocalTime currebtTime1=LocalTime.now();
        System.out.println(currebtTime1);

        System.out.println(currebtTime1.plusHours(3));
        System.out.println(currebtTime1.minusMinutes(6));
        System.out.println(currebtTime1.getSecond());

        System.out.println(currebtTime1.now(ZoneId.of("Japan")));
        System.out.println(currebtTime1.now(ZoneId.of("Turkey")));
        System.out.println(currebtTime1.now(ZoneId.of("Europe/Moscow")));
    }
}
