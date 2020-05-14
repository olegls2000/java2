package data;

public class Admin extends Employee {
    private String department;

    public Admin(int salary, String name, String department) {
        super(salary, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
