package utils;

public class MyUtils {
    private MyUtils() {
    }

    public static double getAverage(int[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
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

    public static int getRandomFromRange(int left, int right) {
        return (int) (Math.random() * right - left) + left;
    }
}
