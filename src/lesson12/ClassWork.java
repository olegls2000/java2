package lesson12;

import data.ConstructorExample;
import data.InterfaceExample;

public class ClassWork {
    public static void main(String[] args) {
        ConstructorExample example = new ConstructorExample();

        InterfaceExample intExample = new InterfaceExampleImpl();
        //intExample.printFromImpl();
        intExample.printFromInterface();


        Sphere sphere1 = new Sphere(5);
        Sphere sphere2 = new Sphere(6);

        boolean result = sphere1 == sphere2;
        System.out.println("sphere1 = sphere2 -> " + result);

        Sphere sphere11 = new Sphere(5);
        Sphere sphere21 = new Sphere(5);

        boolean result1 = sphere11 == sphere21;
        System.out.println("sphere11 = sphere21 -> " + result1);


        Sphere sphereX = new Sphere(99);
        Sphere sphereY = new Sphere(99);
        sphereY = sphereX;

        boolean result2 = sphereX == sphereY;
        System.out.println("sphereX = sphereY -> " + result2);

        Sphere sphereX1 = new Sphere(99);
        Sphere sphereY1 = new Sphere(99);

        boolean resultXY = sphereX1.equals(sphereY1);
        System.out.println("sphereX1.equals(sphereY1) -> " + resultXY);


    }
}
