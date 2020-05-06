//Array
public class Lesson3 {
    public static void main(String[] args) {
        int x = 5;

        //                0  1  2  3
        int[] arrayInt = {1, 2, 3};
        //First Index is 0!
        //Index Access:
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);

        //ArrayIndexOutOfBoundsException
        //System.out.println(arrayInt[3]);

        //Can provide size
        System.out.println(arrayInt.length);
        int i1 = 0;


        String[] arrStrEmpty = new String[3];//length = 3, last index = 2!
        //arrStrEmpty[3] = "UU";
        arrStrEmpty[2] = "ZZ";
        arrStrEmpty[1] = "LL";
        arrStrEmpty[0] = "MM";

        System.out.println(arrStrEmpty[0]);
        //Arrays are IMMUTABLE!!!

        int[][] squareArr = {
                {1, 2},
                {9, 8},
                {11, 99}
        };
        int[][] squareArrEmpty = new int[3][2];
        System.out.println(squareArr.length);
        System.out.println(squareArr[2].length);

        //Iteration construction "for"
        String[] arrStrFilled = {"OP", "TT", "RR"};
        System.out.println(arrStrFilled[2]);
        System.out.println(arrStrFilled);

        int[] newVasja = {1, 2, 3};
        int[] newArray1 = {5, 9, 6, 8, 7, 454};
        printIntArray(newVasja);
        printIntArray(newArray1);

        int x1 = 100;
        int z1 = 888;

        printSum(x1, z1);
        printSum(9999999, 1);
        int summa1 = getSum(2, 5);
        int summa2 = getSum(9, 10);
        int summa3 = getSum(summa1, summa2);
        System.out.println("Summa=" + summa3);

        //0..1    *999
        //0..999  +1
        //1 ..1000
        //1..1000 int

        int randomNumber = (int) (Math.random() * 999) + 1; //1 .. 1000
        int randomNumber1 = (int) (Math.random() * 995) + 5; //5..1000
        int randomNumber3 = getRandomFromRange(5, 1000);
        int randomNumber4 = getRandomFromRange(9000, 10_000);

        System.out.println(randomNumber);
    }

    public static int getRandomFromRange(int left, int right) {
        return (int) (Math.random() * right - left) + left;
    }

    public static void printSum(int number1, int number2) {
        int summ = number1 + number2;

        System.out.println("Summa=" + summ);
    }

    public static int getSum(int number1, int number2) {
        int summ = number1 + number2;
        return summ;
    }

    public static void printIntArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }
}
