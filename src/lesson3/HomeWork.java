package lesson3;

public class HomeWork {

    public static void main(String[] args) {
        int[] array = generateArrayOfInt(10, 90, 100);
        printArray(array);

        int[] array2 = generateArrayOfInt(5, 80, 89);
        printArray(array2);
    }

    public static int[] generateArrayOfInt(int cap, int left, int right) {
        int[] result = new int[cap];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (right - left)) + left;
        }
        return result;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }
}
