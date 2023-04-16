package day19;

import java.time.LocalDate;

public class C04Date {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.plusDays(5));
        System.out.println(tarih.plusMonths(3));
        System.out.println(tarih.plusYears(2));

        System.out.println(tarih.plusDays(3).plusMonths(2).plusYears(1));

        System.out.println(tarih.getYear());
        System.out.println(tarih.getMonth());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getDayOfMonth());
        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());

        System.out.println(tarih.minusDays(12));
        System.out.println(tarih.minusMonths(5));
        System.out.println(tarih.minusYears(2));

        System.out.println(tarih.minusYears(2).plusMonths(3).minusDays(5));

        System.out.println(tarih.isLeapYear());
        LocalDate tarih2=LocalDate.of(2019,03,05);
        System.out.println(tarih.isAfter(tarih2));
        System.out.println(tarih.isBefore(tarih2));

    }

}
