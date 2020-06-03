package data;

public class Employee implements Comparable<Employee> {
    protected int salary;
    protected int age;
    protected String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Employee(String name, int salary) {
        this.salary = salary;
        this.name = name;
    }


    public Employee(int salary, String name, int age) {
        this.salary = salary;
        this.name = name;
        this.age = age;
    }


    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary - o.getSalary();
    }

    private String mySecretMethod() {
        return "Hello from Secret!!!";
    }

    private String mySecretMethodX() {
        return "Hello from Secret X!!!";
    }
}
