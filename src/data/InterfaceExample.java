package data;

import java.io.Serializable;

public interface InterfaceExample extends Serializable, Cloneable {
    //public int age;
    public static final int AGE = 89;

    void printFromInterface();

    default void printZZZ(){
        System.out.println("Print ZZZZ");
    }

}
