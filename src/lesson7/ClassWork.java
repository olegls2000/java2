package lesson7;

import enums.Month;

public class ClassWork {

    public static void main(String[] args) {
        //Enum Home Work:
        Month[] monthes = {Month.JANUARY, Month.MARCH, Month.JANUARY, Month.JUNE};
        int summerCount = getSummerMontCount(monthes);
        System.out.println("Count: " + summerCount);

        Month.JANUARY.printSeason();

        //Scope explanation:
        int out = 1;
        if (true) {
            out++;
            int insideIf = 0;
        } else {
            out++;
            int insideElse = 0;
            //insideIf++;
        }
        //insideElse++;
        //insideIf++;
    }

    public static int getSummerMontCount(Month[] monthes) {
        int count = 0;
        for (int i = 0; i < monthes.length; i++) {
            int result;
            if (monthes[i].season == "summer") {
                count++;
            }
            return 5;
        }
        return count;
    }
}
