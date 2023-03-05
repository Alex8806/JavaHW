public class Main {
    public class Homework {
    }

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];


    }
    static boolean isSumBetween10And20(int a,int b) {
        if ((a + b)<=20 && (a + b) >= 10){
            return true;}
        else
        {return false;}
    }
    private static boolean isPositive(int x) {
       if (x>0){return true;}
        return false;
    }
    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }
    private static boolean isLeapYear(int year) {
        if ((year%4==0 && year%100!=0) || (year%400==0)){
            return true;
        }
        return false;
    }
    private static int[] createArray(int len, int initalValue) {
        int [] array = new int [len];
        for (int i = 0; i < len; i++) {
            array [i]= initalValue;
        }
        return array;
    }



}
