import java.util.*;

/**
 * Есть тест. Нужно извлечь из него все слова и отсортировать по
 * длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный П
 * ора красавица проснись
 * <p>
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 */


public class Main {
    static void ListOfText(String s) {
        String[] split = s.split(" ");
        Map<Integer, List<String>> stats = new HashMap<>();
        for (String sp : split) {
            if (stats.containsKey(sp.length())) {
                stats.get(sp.length()).add(sp);
            } else {
                List<String> stringsList = new ArrayList<>();
                stringsList.add(sp);
                stats.put(sp.length(), stringsList);
            }
        }
        for (int i : stats.keySet()) {
            for (String print : stats.get(i)
            ) {
                System.out.print(print + " ");

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        ListOfText("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");

    }
}
