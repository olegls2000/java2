package lesson10;

import data.*;

public class ClassWork {
    public static void main(String[] args) {
        Employee ivan = new Accouter(99_000, "Ivan", 50);
        Employee irina = new Accouter(30_000, "Irina", 60);
        Employee nikolai = new Accouter(60_000, "Nikolai", 30);

        String[] joeLanguages = {"Java", "JS"};
        Employee joe = new Programmer(100_000, "Joe", joeLanguages);
        String[] filLanguages = {"PHP", "JS"};
        Employee fil = new Programmer(55_000, "Fil", filLanguages);

        Employee markus = new Admin(25_000, "Markus", "IT");
        Employee bruno = new Admin(35_000, "Bruno", "HR");

        Employee[] employees = {ivan, irina, nikolai, joe, fil, markus, bruno};
        Employee employeeWithMaxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            Employee current = employees[i];
            if (current.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = current;
            }
        }

        System.out.println("Employee max salary: " + employeeWithMaxSalary.getSalary());

        if (employeeWithMaxSalary instanceof Programmer) {
            System.out.println("Programmer has max salary");
        }
        if (employeeWithMaxSalary instanceof Accouter) {
            System.out.println("Accouter has max salary");
        }
        //...

        Shape triangle1 = new SimpleTriangle(9, 10, 7);
        Shape triangle2 = new SimpleTriangle(7, 10, 8);
        Shape triangle3 = new SimpleTriangle(8, 8, 6);

        Shape square1 = new SimpleSquare(8);
        Shape square2 = new SimpleSquare(7);
        Shape square3 = new SimpleSquare(9);

        Shape circle1 = new SimpleCircle(9);
        Shape circle2 = new SimpleCircle(8);
        Shape circle3 = new SimpleCircle(10);

        Shape[] shapes = {triangle1, triangle2, triangle3,
                square1, square2, square3,
                circle1, circle2, circle3};


    }
}
