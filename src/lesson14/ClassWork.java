package lesson14;

//Recursion:
public class ClassWork {
    public static void main(String[] args) {
        recursion(0);
        int fibo = getFibo(8);
        System.out.println(fibo);

        //String
        String strPool1 = "TT";
        String strPool2 = "TT";
        String strPool3 = "TT";
        String strHeap1 = new String("TT");
        String strHeap2 = new String("TT");

        System.out.println(strPool1 == strPool2);
        System.out.println(strHeap1 == strHeap2);
        System.out.println(strHeap1.equals(strHeap2));

        System.out.println(strHeap1 + "Hello");

        System.out.println(strHeap1);

        String strHeap1Mutated = strHeap1 + "Hello";
        System.out.println(strHeap1Mutated);


        System.out.println(strHeap1Mutated.startsWith("T"));
        //equals,
        // equals ignorecase,
        // trim(),
        // charAt(int);
        // indexOf(char);
        // substring(int, int);
        // replace(char, char);
        // contains();
        // startWith(char),
        // split(char)

        //We have a sentence, find quantity of Words that start from letter "P"
    }


    public static void printUniqueWords(String sentence){


    }

    public static int getCountOfWordsStartFrom(String sentence, String startLetter) {
        //TODO ..
        return 0;
    }

    //            n-2  n-1  n
    //1   2   3   4    5    6   7   8  ...
    //0   1   1   2    3    5   8   13  ...

    public static int getFibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getFibo(n - 2) + getFibo(n - 1);
    }


    public static void recursion(int i) {
        if (i == 5_100) {
            System.out.println("i=" + i + ". Basement");
            return;
        }
        System.out.println("i=" + i + ", I am going dipper ...");
        recursion(++i);
    }

    //0 1 2 3 .. n
    public static void printNumbers(int n) {

    }
}
