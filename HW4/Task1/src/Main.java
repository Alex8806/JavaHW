//Реализовать консольное приложение, которое:
//
//        Принимает от пользователя строку вида text~num
//
//        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//
//        Если введено print~num, выводит строку из позиции num в связном списке.
//
//        Если введено exit, завершаем программу
//
//        Пример:
//        string~4
//        num~3
//        print~3
//
//        num
//        print~4
//        string
//        my_value~1
//        print~1
//        my_value

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        while (true) {
            System.out.println(" Write command#index");
            String s = sc.nextLine();
            String[] split = s.split("#");
            System.out.println(Arrays.toString(split));
            int n = Integer.parseInt(split[1]);
            if (split[0].toLowerCase().equals("exit")) {
                break;
            }
            else if (split[0].toLowerCase().equals("print")) {
                try {
                    System.out.println(list.get(Integer.parseInt(split[1])));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Wrong number");
                }
            } else {
                if (n < list.size()) {
                    list.set(n, split[0]);
                } else{
                    for (int i = list.size(); i < n; i++) {
                        list.add(i,null);
                    }
                    list.add(n,split[0].toString());
                }
            }
        }

    }
}