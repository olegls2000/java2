package lesson1;

/**
 * primitive types;
 * arithmetic operations
 */
public class ClassWork {

    public static void main(String[] args) {
        //8 bit  -128 .. 127
        byte minNumber = -128;
        System.out.println("minNumber=" + minNumber);
        //16 bit
        short sh = 1000;
        //32 bit
        int in = 1000000000;
        System.out.println(Integer.MAX_VALUE);
        //64 bit
        long ln = 1000000000l;
        //32 bit
        float fl = 1.556f;
        //64 bit
        double dbl = 1.556;
        char ch = '\'';
        boolean bln1 = true;
        boolean bln2 = false;
        String str = "STR..";

        //Down casting:
        int a = 12;
        long b = 1299898888l;
        a = (int) b;
        System.out.println("b=" + b);
        System.out.println("a=" + a);

        //Up casting:
        int t = 12;
        double d = 12.99;
        d = (double) t;
        System.out.println(d);

        //Example:
        int y = 12;
        double z = 12.9999999;
        y = (int) z;
        System.out.println(y);

        // + - * / ^ %
        System.out.println(38 % 6);

        int i = 1000;
        //i = i + 1;
        i++;
        System.out.println(i);

        int i1 = 1000;
        //i1 = i1 - 1;
        i1--;
        System.out.println(i1);

        int i2 = 1000;
        //i2 = i2 + 5;
        i2 += 5;
        System.out.println(i2);

        int i3 = 1000;
        //i3 = i3 * 6;
        i3 *= 6;
        System.out.println(i3);

        int tt = 5;
        //pre fix
        //System.out.println(++tt);
        System.out.println(++tt);
        System.out.println(tt);
        //post fix
        System.out.println(tt++);
        System.out.println(tt);

    }
}
