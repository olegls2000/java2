package lesson17;

import data.Employee;
import data.Shape;
import data.SimpleTriangle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ClassWork {
    public static void main(String ... args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "VAL1");
        map.put(2, "VAL2");
        map.put(3, "VAL3");
        map.put(3, "VAL4");
        map.put(3, "VAL5");

        System.out.println(map);
   /*
              Hash     Key     Value
            |   1  |  1  |   "VAL1"
            |   2  |  2  |   "VAL2"
            |   3  |  3  |   "VAL5"
            |   4  |  4  |   "VAL2"
          */

        Map<Long, Employee> employeeMap = new HashMap<>();
        employeeMap.put(37518060302L, new Employee(55_000, "Joe"));
        employeeMap.put(57518060309L, new Employee(65_000, "Jul"));

        System.out.println(employeeMap);

        final Employee employee = employeeMap.get(37518060302L);
        System.out.println("37518060302L -> " + employee);

        //Write a Java program to associate the specified value with the specified key in a HashMap.

        //Write a Java program to count the number of key-value (size) mappings in a map
        //Write a Java program to copy all of the mappings from the specified map to another map.
        //Write a Java program to check whether a map contains key-value mappings (empty) or not.Try to use .clear()
        //Write a Java program to test if a map contains a mapping for the specified key.
        //Write a Java program to test if a map contains a mapping for the specified value.
        //Write a Java program to create a set view of the mappings contained in a map.

        //Tree Set
        Set<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee(20_000, "K"));
        treeSet.add(new Employee(17_000, "J"));
        treeSet.add(new Employee(18_000, "L"));
        treeSet.add(new Employee(15_000, "R"));

        System.out.println(treeSet);

        System.out.println("-----------------------------------");
        final EmployeeAgeComparator ageComparator = new EmployeeAgeComparator();
        Set<Employee> treeSetByAge = new TreeSet<>(ageComparator);
        treeSetByAge.add(new Employee(20_000, "J", 25));
        treeSetByAge.add(new Employee(20_000, "L", 18));
        treeSetByAge.add(new Employee(20_000, "P", 35));
        System.out.println(treeSetByAge);

        System.out.println("-----------------------------------");
        Set<Employee> treeSetByName = new TreeSet<>((o1, o2) -> o1.getName().compareTo(o2.getName()));

        treeSetByName.add(new Employee(90_000, "D"));
        treeSetByName.add(new Employee(80_000, "A"));
        treeSetByName.add(new Employee(30_000, "a"));
        treeSetByName.add(new Employee(66_000, "C"));
        treeSetByName.add(new Employee(44_000, "1C"));

        System.out.println(treeSetByName);


        //Reflection!!!!!
        System.out.println("-----------------------------------");
        Employee emp = new Employee(99_990, "Nikolos");

        Shape shapeX = new SimpleTriangle(9, 9, 8);
        //  shapeX.getSquare();
        Class shapeClass = shapeX.getClass();
        System.out.println("Shape Class -> " + shapeClass);

        final Method[] methods = shapeClass.getMethods();
        for (Method method : methods) {
            System.out.println("method -> " + method.getName());

            if (method.getName().equals("getPerimetr")) {
                Object result = method.invoke(shapeX);
                System.out.println("getPerimetr() -> " + result);
            }
        }

        final Field[] fields = shapeClass.getFields();
        for (Field field : fields) {
            System.out.println("field -> " + field.getName());
        }

        final Constructor[] constructors = shapeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("constructor -> " + constructor.getName());
        }

        Employee employeeWithSecret = new Employee(87_000, "Joe");
        final Class empClass = employeeWithSecret.getClass();
        final Method[] employeeMethods = empClass.getDeclaredMethods();
        for (Method method : employeeMethods) {
            System.out.println(method.getName());
            if (method.getName().toLowerCase().contains("secret")) {
                method.setAccessible(true);
                final Object secretResult = method.invoke(employeeWithSecret);
                System.out.println(secretResult);
            }
        }

        System.out.println("-----------------------------------");
        Employee newEmployee = null;
        final Constructor[] constructorsEmp = Employee.class.getConstructors();
        for (Constructor constructor : constructorsEmp) {
            System.out.println(constructor.getParameterCount());
            if (constructor.getParameterCount() == 2) {
                newEmployee = (Employee) constructor.newInstance(66_000, "From Reflection");
            }
        }
        if (newEmployee != null) {
            System.out.println(newEmployee);
        }
        System.out.println("Var Args-----------------------------------");
        myVarArgsPrint(1, employee);
        myVarArgsPrint(1, "FF");
        myVarArgsPrint(9, "FFFFF");
        myVarArgsPrint(9, 9);
        myVarArgsPrint(9, 9, 9);
        myVarArgsPrint(9, 9, 9, 9);
    }

    public static void myVarArgsPrint(int xi, Object ... varArgs) {
        System.out.println(varArgs);
        for(Object i: varArgs) {

            System.out.println(i);
        }
    }

}
