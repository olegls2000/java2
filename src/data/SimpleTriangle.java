package data;

import java.util.Objects;

public class SimpleTriangle extends Shape {
    private int a;
    private int b;
    private int c;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleTriangle)) return false;
        SimpleTriangle that = (SimpleTriangle) o;
        return a == that.a &&
                b == that.b &&
                c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

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

    public double getPerimetr() {
        System.out.println("Hello from SimpleTriangle");
        return a + b + c;
    }

    @Override
    public double getSquare() {
        return (a * b * c) / 2;
    }

    @Override
    public void methodFromParent() {
        System.out.println("Hello from Triangle!!!!");
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
