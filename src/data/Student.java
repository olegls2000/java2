package data;

public class Student {

    public Student(){
        System.out.println("Hello from data.Student Constructor");
    }

    public Student(String firstName){
        this.firstName = firstName;
    }

   public Student(String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int age;
    public String firstName;
    public String lastName;
    public String email;
    public String group;
    public long idCode;

    public void changeGroup(String newGroup) {
        this.group = newGroup;
    }

    public void getOlder() {
        //this.age = this.age + 1;
        this.age++;
    }
}
