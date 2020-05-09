package lesson2;

/**
 * logical operations;
 * logical constructions.
 */
public class ClassWork {
    public static void main(String[] args) {
        printNumber(0, "EE");
        //  >, <, ==, >=, <=, !=
        System.out.println("7 > 8 = " + (9 > 8));
        System.out.println("7 < 8 = " + (7 < 8));
        System.out.println("7 == 8 = " + (7 == 8));
        System.out.println("7 >= 8 = " + (7 >= 8));
        System.out.println("7 <= 8 = " + (7 <= 8));
        System.out.println("7 != 8 = " + (7 != 8));

        boolean expr1 = 5 > 6;
        boolean expr2 = 5 > 6;
        boolean expr3 = 5 > 6;

        //  & -> LOGICAL AND
        //  && -> speedup calculation
        boolean result = expr1 && expr2 && expr3;
        System.out.println("AND result: " + result);

        int x = 7;
        //Check if numbers are from the range [5..9);
        boolean fromRange = x >= 5 && x < 9;
        System.out.println("Belongs to the range [5..9): " + fromRange);
        System.out.println("Doesn't belong to the range [5..9): " + !fromRange);

        //  ! -> LOGICAL NOT
        boolean t = true;
        boolean t1 = !t;
        System.out.println("t=" + t);
        System.out.println("t1=" + t1);

        //  | -> LOGICAL OR
        //Check if numbers are from ranges: [2..5) , (10..12);
        int x1 = 15;
        //boolean fromRange1 = x1 >= 2 && x1 < 5;
        //boolean fromRange2 = x1 > 10 && x1 < 12;
        //boolean resultForOR = fromRange1 || fromRange2;
        boolean resultForOR = (x1 >= 2 && x1 < 5) || (x1 > 10 && x1 < 12);
        System.out.println("Belongs to the ranges: [2..5) , (10..12): " + resultForOR);

        //Ternary operator
        boolean bb = false;
        int str = bb ? 5 : 7;
        System.out.println(str);


        boolean a = true;
        boolean b = true;

        if (!(a && b)) {
            System.out.println("XXX");
        } else {
            System.out.println("YYY");
        }
        //Есть три отрезка, различной длины, данные хранятся в переменных а, b и c.
        // Проверить возможно ли из этих отрезков создать треугольник.
        int at = 1;
        int bt = 1;
        int ct = 10;
        if (at + bt > ct && at + ct > bt & ct + bt > at) {
            System.out.println("Triangle!!!");
        } else {
            System.out.println("Not possible!!!");
        }

        //        switch / case
        int r = 2;
        switch (r) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Def");
        }
        printNumber(5, "oo");
        printNumber(9, "jj");
        printNumber(222, "rr");
        printClosest(4, 6, 10);
        printClosest(89, 898, 100000);
    }

    public static void printClosest(int m, int n, int target) {
        //Создать программу,
        // выводящую на экран ближайшее к 20 из двух чисел,
        // записанных в переменные m и n.
        // Например, среди чисел 10 и 31 ближайшее к 20 число 10.
        //int m = 5;
        //int n = 31;
        //int target = 20;
        int strp = Math.abs(target - n) < Math.abs(target - m) ? n : m;
        System.out.println(strp);
    }

    public static void printNumber(int number, String username) {
        number++;
        System.out.println("Number is " + number + "!!!");
        System.out.println("End!");

        number *= 10;
        System.out.println(number);

        double dd = 1.03;
        System.out.println("Username is " + username);
    }
}