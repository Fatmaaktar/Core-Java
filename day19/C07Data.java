package day19;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C07Data {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yy");
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(dtf.format(tarih));
        System.out.println(dtf.format(tarih.plusMonths(9)));

        LocalTime saat=LocalTime.now();
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(saat));
    }
}
