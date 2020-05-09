package data;

public class SimpleTriangle {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) {
        sidesCheck(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private void sidesCheck(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Invalid sides combination!");
        }

        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab < c || bc < a || ac < b) {
            throw new IllegalArgumentException("Invalid sides combination!");
        }
    }


    public int getPerimetr() {
        //return this.a + this.b + this.c;
        return a + b + c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        sidesCheck(a, this.b, this.c);
        this.a = a;
    }


    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
