package data;

public abstract class Worker {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected long salary;

    public Worker(String firstName, String lastName, int age, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }
}
