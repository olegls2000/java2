package data;

public class Director extends Worker {
    private String department;

    public Director(String firstName,
                    String lastName,
                    int age,
                    long salary,
                    String department) {
        super(firstName, lastName, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
