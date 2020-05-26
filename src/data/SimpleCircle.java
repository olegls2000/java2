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

    //@Override
    public void fromCircleMethod(){

    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public void methodFromParent() {
        System.out.println("Hello from Triangle!!!!");
    }
}
