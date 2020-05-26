package lesson12;

import java.util.Objects;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sphere)) return false;
        Sphere sphere = (Sphere) o;
        return Double.compare(sphere.radius, radius) == 0;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Buy buy I am gone!!!");
    }
}
