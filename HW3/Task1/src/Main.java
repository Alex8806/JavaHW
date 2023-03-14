//Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
            int n = (int) (Math.random() * 9)+1;
        System.out.println(("N= "+ n));
            ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
                list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        list.removeIf(s-> s%2!=0);
        System.out.println(list);
    }
}