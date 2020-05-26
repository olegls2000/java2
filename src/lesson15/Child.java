package lesson15;

import exception.MyCheckedException;

public class Child extends Parent {
    //Can throw the same or more specific exception!!!
    @Override
    public void metod1() throws MyCheckedException {
        System.out.println("Hello from Child!");
        throw new MyCheckedException();
    }

    //Can NOT throw wider exception!!!
    @Override
    //public void metod2() throws Exception {
    public void metod2() throws MyCheckedException {
        System.out.println("Hello from Child!");
        //throw new Exception();
        throw new MyCheckedException();
    }

    //Can NOT throw exception if parent doesn't throw!!!
    @Override
    //public void metod3() throws Exception {
    public void metod3() {
        System.out.println("Hello from Parent");
    }
}
