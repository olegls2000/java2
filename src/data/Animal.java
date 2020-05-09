package data;

import enums.Gender;

public class Animal {

    public Animal(String name, int age, String kind, Gender gender) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.gender = gender;
    }

    public final String kind;
    public final Gender gender;
    public String name;
    public int age;
}
