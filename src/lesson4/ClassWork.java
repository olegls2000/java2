package lesson4;

public class ClassWork {
    /*
    Создайте метод, возвращающий массив из всех нечетных чисел от 0 до 30,
    и который выведит его на печать в прямом и обратном порядке.
    trazbit na metody!!!
     */

    public static void main(String[] args) {
        int[] arr = getOddArray();
        double average = getAverage(arr);
        System.out.println(average);

        method2();
    }

    public static double getAverage(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            //sum = sum + array[i];
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int[] getOddArray() {
        int[] result = new int[15];
        int current = 1;

        for (int i = 0; i < result.length; i++) {
            if (current < 30) {
                result[i] = current;
            }
            current = current + 2;
        }
        printForward(result);
        printReverse(result);

        return result;
    }

    public static void printForward(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printReverse(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    /*
Создайте массив из случайных чисел от -10 до 10 length = 6,
Найти максимальный и минимальный элементы массива и поменять их местами.
Выведите  на печать индекс последнего вхождения максимального и минимального элемента,
количество вхождений максимального и минимального элемента.
Разбить на методы.
    * */

    public static void method2() {
        int[] array = getArray(6, -10, 10);
        int iMax = getMaxIndex(array);

        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Minimum in array is: " + array[iMin]);
        //  1  2   9   6  9 9 9 1
        int temp = array[iMax]; //9
        array[iMax] = array[iMin];
        //  1  2   -1   6  -1
        array[iMin] = temp;
        //  1  2  -1   6   9
    }

    public static int[] getArray(int capacity, int left, int right) {
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (right - left)) + left;
        }
        return array;
    }

    public static int getMaxIndex(int[] array) {
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        System.out.println("Maximum in array is: " + array[iMax]);
        return iMax;
    }
}
