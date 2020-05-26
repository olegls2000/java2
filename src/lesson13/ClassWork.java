package lesson13;

import data.SimpleCircle;
import data.SimpleTriangle;
import data.Worker;
import lesson12.Sphere;

public class ClassWork {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        Sphere sphere1 = new Sphere(6);
        Sphere sphere2 = new Sphere(6);
        Sphere sphere3 = new Sphere(2);
        SimpleCircle simpleCircle = new SimpleCircle(9);

        System.out.println(sphere1.equals(sphere1));
        System.out.println(sphere1.equals(simpleCircle));
        System.out.println(sphere1.equals(sphere2));
        System.out.println(sphere1.equals(sphere3));

        System.out.println("sphere1 == sphere2 -> "
                + (sphere1 == sphere2));
        System.out.println("sphere1.equals(sphere2) -> "
                + sphere1.equals(sphere2));

        System.out.println(sphere1);

        System.out.println(sphere1.hashCode());
        System.out.println(sphere2.hashCode());
        System.out.println(sphere3.hashCode());

        SimpleTriangle triangle1 = new SimpleTriangle(5,6,9);
        SimpleTriangle triangle2 = new SimpleTriangle(5,6,7);




    }
}
