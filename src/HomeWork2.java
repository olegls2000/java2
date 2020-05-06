/*
------------L2: Homework:------------
        1. Cоздайте метод, который принимает в качестве параметров два вещественных числа и проверят какое из чисел больше,
        если первое то метод выводит сообщение"первое больше" иначе  "второе больше".
        2. Создать метод, выводящий на печать три числа, переданные ему в качестве параметров
        в строго возрастающей последовательности.
        3. Создать метод, выводящий на печать три числа, переданные ему в качестве параметров в строго ubivajushei!!!
         последовательности.
        4. Создать метод, проверяющ находится ли число X в интервале [A … B). X, A, B parametry metoda.
        5. Создать метод, проверяющ переменную b (parametr metoda) в случае если переменная равна 6, 5, 8, 9 выводить
        "False " иначе выводить "True".
        6. *. В три переменные a, b и c записаны три вещественных числа(parametry metoda).
        Создать метод, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        либо сообщать, что корней нет. (https://www.mathsisfun.com/algebra/quadratic-equation.html posmotret Summary)
*/

public class HomeWork2 {
    public static void main(String[] args) {
        myMethod(99.33333, 99.333);
        olegsMethod(10, 15, 1);
        System.out.println();
        olegsMethodX(10, 15, 1);
    }

    public static void myMethod(double n1, double n2) {
        if (n1 > n2) {
            System.out.println("N1 is bigger");
        } else {
            System.out.println("N2 is bigger");
        }
    }

    public static void olegsMethod(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.print(number1);
            if (number2 > number3) {
                System.out.print(number2);
                System.out.print(number3);
            } else {
                System.out.print(number3);
                System.out.print(number2);
            }
            return;
        }
        if (number2 > number1 && number2 > number3) {
            System.out.print(number2);
            if (number1 > number3) {
                System.out.print(number1);
                System.out.print(number3);
            } else {
                System.out.print(number3);
                System.out.print(number1);
            }
            return;
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println(number3);
            if (number1 > number2) {
                System.out.print(number1);
                System.out.print(number2);
            } else {
                System.out.print(number2);
                System.out.print(number1);
            }
        }
    }

    public static void olegsMethodX(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            System.out.print(number1);
            if (number2 < number3) {
                System.out.print(number2);
                System.out.print(number3);
            } else {
                System.out.print(number3);
                System.out.print(number2);
            }
            return;
        }
        if (number2 < number1 && number2 < number3) {
            System.out.print(number2);
            if (number1 < number3) {
                System.out.print(number1);
                System.out.print(number3);
            } else {
                System.out.print(number3);
                System.out.print(number1);
            }
            return;
        }
        if (number3 < number1 && number3 < number2) {
            System.out.print(number3);
            if (number1 < number2) {
                System.out.print(number1);
                System.out.print(number2);
            } else {
                System.out.print(number2);
                System.out.print(number1);
            }
        }
    }

}
