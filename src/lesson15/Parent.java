package lesson15;

import exception.MyCheckedException;

public class Parent {
    public void metod1() throws Exception {
        System.out.println("Hello from Parent");
        throw new Exception();
    }

    public void metod2() throws MyCheckedException {
        System.out.println("Hello from Parent");
        throw new MyCheckedException();
    }

    public void metod3() {
        System.out.println("Hello from Parent");
    }
}
