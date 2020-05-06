public class Animal {

    public Animal(String name, int age, String kind, Gender gender) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.gender = gender;
    }

    final String kind;
    final Gender gender;
    String name;
    int age;
}
