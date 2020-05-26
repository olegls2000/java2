package lesson15;

import exception.MyChException1;
import exception.MyCheckedException;
import exception.MyRuntimeException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassWork {
    public static void main(String[] args) {
        //EXCEPTIONS!!!!

        //Handling REQUIRED!!!
        testRuntimeExc(0);


        Connection connection = null;
        try {
            connection = DriverManager.getConnection("127.0.0.1:8080");
            connection.commit(); //can throw an Exception!!!!
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        try (Connection connectionX = DriverManager.getConnection("127.0.0.1:8080");
             Connection connectionY = DriverManager.getConnection("127.0.0.1:8081")) {
            connectionX.commit();
            connectionY.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Final operation!!!");
        }


        try {
            testCheckedExc(10);
            testCheckedExc(10_000);
            testCheckedExc(-10_000);
            testCheckedExc(5);
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (MyChException1 e1) {
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        } catch (Throwable thr) {
        } finally {

        }


        //Handling is  not necessary but possible
        try {
            testRuntimeExc(0);
        } catch (RuntimeException re) {
            re.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        File file = new File("c:\\work\\tt.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void testCheckedExc(int i) throws Exception {
        if (i > 1_000) {
            MyCheckedException exc = new MyCheckedException();
            exc.printStackTrace();
            throw exc;
            //System.out.println("Hello");
        }
        if (i < 0) {
            throw new MyChException1("i can't be NEGATIVE!!!");
        }
        if (i == 5) {
            throw new Exception("i can't be 5!!!");
        }
        System.out.println("Ok");
    }

    public static void testRuntimeExc(int i) {
        if (i == 0) {
            throw new MyRuntimeException("I can not be 0!!!");
        }
    }
}
