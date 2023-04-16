package day19;

import java.time.LocalDate;
import java.time.Period;

public class C08Data {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.now();
        LocalDate bd1=LocalDate.of(1997,5,23);

        Period age=Period.between(bd1,d1);
        System.out.println(age);

        int ageYear=Period.between(bd1,d1).getYears();
        System.out.println(ageYear);

    }
}
