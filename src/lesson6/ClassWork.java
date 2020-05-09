package lesson6;

import data.Animal;
import data.Student;
import enums.Gender;

public class ClassWork {
    public static void main(String[] args) {
        //primitive type!!!
        int i = 5;
        long l = 5l;
        boolean b = true;
        char ch = 't';

        //object type!!!
        String str = "RTRT";

        Student anton = new Student();
        anton.firstName = "Anton";
        anton.age = 22;
        anton.group = "IT-8";

        anton.changeGroup("IT-99");
        anton.getOlder();


        Student natali = new Student("Natali");
        natali.group = "FF-1";
        natali.age = 25;
        natali.changeGroup("FF-9");
        natali.getOlder();

        Student nik = new Student("Nik", 30);

        //anton = natali;
        anton = null;
        //HEAP stores objects!!
        //PERM GEM == METAINFO  stores Classes!!!
        //Stack  - stores call stack

        //System.gc();
        System.out.println("Objects are cool!!!!");
        myMeth();

        //data.Animal: kind, name, gender
        Animal cat = new Animal("Barsik", 2,"cat", Gender.MALE);
        Animal dog = new Animal("Pirat", 10, "dog", Gender.FEMALE);
        Animal pig = new Animal("Pepa", 1, "pig", Gender.FEMALE);

        Animal[] zoo = {cat, dog, pig};
        Animal oldest = getOldestAnimal(zoo);
    }

    public static Animal getOldestAnimal(Animal[] zoo) {
        int maxAgeIndex = 0;
        for (int j = 1; j < zoo.length; j++) {
            Animal maxAgeAnimal = zoo[maxAgeIndex];
            Animal current = zoo[j];
            if (current.age > maxAgeAnimal.age) {
                maxAgeIndex = j;
            }
        }
        Animal oldestAnimal = zoo[maxAgeIndex];
        System.out.println("Max Name: " + oldestAnimal.name);
        System.out.println("Max Age: " + oldestAnimal.age);
        return oldestAnimal;
    }


    public static void myMeth() {
        System.out.println("hello from My meth..");
    }
}
