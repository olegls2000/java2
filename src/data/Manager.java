package data;

public class Manager extends Worker {
    private String team;

    public Manager(String firstName, String lastName, int age, long salary, String team) {
        super(firstName, lastName, age, salary);
        this.team = team;
    }

}
