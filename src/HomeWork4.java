public class HomeWork4 {
    public static void main(String[] args) {
        int[] array = getFiboNumbersArray();

        printHello();
        printByWhile(array);

        int a = 10;
        int k = 2;
        while (a > 1) {
            a = a - 2;
            k = k + 1;
        }
        System.out.println("K=" + k);
        System.out.println("A=" + a);

        int l = 5;
        int j = 0;
        while (l < 10) {
            l += 3;
            j -= 10;
        }
        System.out.println("L=" + l);//8
        System.out.println("J=" + j);//-10



    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void printByWhile(int[] arr) {
        System.out.print("[");
        int count = 0;
        while (count < arr.length) {
            System.out.print(arr[count]);
            System.out.print(", ");
            count++;
        }
        System.out.print("]");
        System.out.println();
    }

    /*
    1. Cоздайте метод. Kotorij sozdajot i vozvrashaet massiv iz pervih dvadcati chisel Fibinachi. Vyvesti rezultaty v console;
     */
    public static int[] getFiboNumbersArray() {
        /// 0 -> 1 -> 1 -> 2 -> 3 -> 5 -> 8 ...
        //n = n-1  + n-2
        int[] fiboArray = new int[20];
        for (int i = 0; i < fiboArray.length; i++) {
            if (i == 0) {
                fiboArray[i] = 0;
                continue;
            }
            if (i == 1) {
                fiboArray[i] = 1;
                continue;
            }
            fiboArray[i] = fiboArray[i - 1] + fiboArray[i - 2];
        }
        return fiboArray;
    }

    //Napechatat "Hello" 10 raz!
    public static void printHello() {
        int count = 0;
        while (count < 10) {
            System.out.println("Hello");
            count++;
        }
    }
}
