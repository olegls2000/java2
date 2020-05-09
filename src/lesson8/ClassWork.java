package lesson8;


import data.Car;
import data.Person;
import data.SimpleTriangle;
import data.Student;
import enums.Month;


public class ClassWork {
    public static void main(String[] args) {
        //impossible to use class from src!!!
        // Root root = new Root();

        Month month1 = Month.JANUARY;
        Student student = new Student("Nikolas");
        //System.out.println(student.firstName);

        Car car = new Car();

        Person person = new Person(40, "Joe");
        System.out.println("Age: " + person.getAge());
        person.setAge(41);
        System.out.println("Age: " + person.getAge());

        System.out.println("FirstName: " + person.getFirstName());
        person.setFirstName("mr. Joe");
        System.out.println("FirstName: " + person.getFirstName());

        SimpleTriangle simpleTriangle = new SimpleTriangle(9, 8, 7);
        System.out.println("Perimetr=" + simpleTriangle.getPerimetr());
        simpleTriangle.setA(1000);

        SimpleTriangle simpleTriangle1 = new SimpleTriangle(9, 1, 1000);
    }

}
