//Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"


import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        boolean flag = false;
        int n = 0;
        System.out.println("Put N - ");
        while (n <= 0 || n % 2 != 0) {
            while (!iScanner.hasNextInt()) {
                System.out.println("Not number");
                iScanner.next();
            }

            n = iScanner.nextInt();
            if (n <= 0 || n % 2 != 0) {
                System.out.println("Wrong number");
            }
        }
        System.out.println(n);
        System.out.println("Put c1");
        char c1 = iScanner.next().charAt(0);
        System.out.println(c1);
        System.out.println("Put c2");
        char c2 = iScanner.next().charAt(0);
        System.out.println(c2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sb.append(c1);
            else
                sb.append(c2);
        }

        System.out.println(sb);
    }
}
