package data;

public class SimpleCircle extends Shape {
    private int radius;

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    public double getPerimetr() {
        System.out.println("Hello from SimpleCircle");
        return 2 * Math.PI * radius;
    }
}
