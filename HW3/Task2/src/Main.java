//Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример:
//        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);
        int i = 0;
        int temp;
        while (i < list.size()) {
            try {
                temp = Integer.parseInt(list.get(i));
                list.remove(i);
            } catch (NumberFormatException e) {
                i++;
                continue;
            }
        }
        System.out.println(list);
    }
}