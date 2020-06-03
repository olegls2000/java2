package lesson16;

import data.*;
import lesson12.Sphere;

import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        SimpleTriangle triangle = new SimpleTriangle(9, 10, 11);
        Employee employee = new Employee(55_000, "Ivan");

        ArrayList<Employee> arrayList = new ArrayList();
        ArrayList<SimpleTriangle> arrayListT = new ArrayList();

        System.out.println("arrayList.size() = " + arrayList.size());
        //arrayList.add(triangle);
        arrayList.add(employee);

        for (int i = 0; i <= 101; i++) {
            arrayList.add(employee);
        }
        System.out.println("arrayList.size() = " + arrayList.size());
        for (int i = 14; i < arrayList.size(); i++) {
            final Employee employee1 = arrayList.get(1);
            employee1.getSalary();
            employee1.getName();

            System.out.println(arrayList.get(i));
        }


        arrayList.clear();
        System.out.println("arrayList.size() = " + arrayList.size());

        List<Shape> shapes = new ArrayList<>(10);
        shapes.add(new SimpleTriangle(9, 10, 7));
        shapes.add(new SimpleTriangle(7, 10, 8));
        shapes.add(new SimpleTriangle(8, 8, 6));
        shapes.add(new SimpleSquare(8));
        shapes.add(new SimpleSquare(7));
        shapes.add(new SimpleSquare(9));
        shapes.add(new SimpleCircle(9));
        shapes.add(new SimpleCircle(8));
        shapes.add(new SimpleCircle(10));

        Shape maxPerim = getShapeWithMaxPerimetr(shapes);
        System.out.println("Max Perimetr Shape: " + maxPerim);
        System.out.println("PRACTICE: ");
        System.out.println("===========================================================================================");
        //Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> colors = new ArrayList<>();
        colors.add("GREEN");
        colors.add("WHITE");
        colors.add("PURPLE");
        System.out.println(colors);

        System.out.println("--------------");
        //Write a Java program to iterate through all elements in a array list.
        for (String color : colors) {
            System.out.println("color = " + color);
        }

        System.out.println("--------------");
        //Write a Java program to insert 10 element into the array list at the first position
        int i = 1;
        while (i <= 10) {
            colors.add(0, "Green" + i);
            i++;
        }
        System.out.println(colors);


        System.out.println("--------------");
        //Write a Java program to print an even element  from a given array list.
        for (int j = 0; j < colors.size(); j++) {
            if (j % 2 == 0) {
                System.out.println(colors.get(j));
            }
        }

        System.out.println("--------------");
        //Write a Java program to update specific collection element by given element (put words that contains "R" to lower Case)
        for (int j = 0; j < colors.size(); j++) {
            String current = colors.get(j);
            if (current.contains("R")) {
                colors.set(j, current.toLowerCase());
            }
        }
        System.out.println(colors);
        System.out.println("--------------");

        //Write a Java program to remove the third element from a list. Call it several times.
        colors.remove(3);
        colors.remove(3);
        colors.remove(3);
        System.out.println(colors);
        System.out.println("--------------");

        //Write a Java program to search an element(WHITE) in a array list, print out its index.
        int index = colors.indexOf("WHITE");
        System.out.println("WHITE has index: " + index);

        System.out.println("--------------");
        //Write a Java program to copy one array list into another.
        List<String> list1 = new ArrayList<>();
        list1.add("A1");
        list1.add("B1");
        List<String> list2 = new ArrayList<>();
        list2.add("A2");
        list2.add("B2");
        list2.add("C2");

        Collections.copy(list2, list1);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        System.out.println("--------------");
        //Write a Java program to shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println(colors);

        System.out.println("--------------");
        //Write a Java program to reverse elements in a array list.
        Collections.reverse(colors);
        System.out.println(colors);
        System.out.println("============== SETs: ===============");
        Set<String> set = new HashSet<>(10, 0.5f);
        boolean a1 = set.add("A");
        boolean a2 = set.add("A");
        boolean b1 = set.add("B");
        boolean b2 = set.add("B");
        set.add("Z");
        set.add("K");

        String z = "Z";
        if(set.contains(z)) {
        }
        System.out.println(set);

        Set<String> treeSet = new TreeSet<>();
        Set<Employee> employees = new TreeSet<>();
        employees.add(employee);


    }

    public static Shape getShapeWithMaxPerimetr(List<Shape> shapesX) {
        Shape max = shapesX.get(0);
        for (int i = 1; i < shapesX.size(); i++) {
            Shape current = shapesX.get(i);
            if (current.getPerimetr() > max.getPerimetr()) {
                max = current;
            }
        }
        return max;
    }

    public static Shape getShapeWithMin(List<Shape> shapesX) {
        Shape max = shapesX.get(0);
        for (int i = 1; i < shapesX.size(); i++) {
            Shape current = shapesX.get(i);
            if (current.getSquare() < max.getSquare()) {
                max = current;
            }
        }
        return max;
    }
}
