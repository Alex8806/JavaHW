//Создать класс Person.
//        У класса должны быть поля:
//        1. Имя (String)
//        2. Фамилия (String)
//        3. Возраст (продумать тип)
//        4. Пол
//        5*. Придумать свои собственные поля
//        Для этого класса
//        1. Реализовать методы toString, equals и hashCode.
//        2*. Придумать собственные методы и реализовать их
//        В мейне создать массив Person'ов. В цикле отобрать Person'ов старше
//        20 лет и вывести их на экран.

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", 35, "male ", "divorced", "Russia");
        Person person2 = new Person("John", "Brown", 45, "male ", "divorced", "USA");
        Person person3 = new Person("Olga", "Petrova", 25, "female ");
        Person person4 = new Person("Bill", "Klinton", 65, "male ", "married", "USA");
        Person person5 = new Person("Uma", "Turman", 45, "female ", "married", "USA");
        Person person6 = new Person("Jesse", "Pinkman", 15, "male ", "single", "USA");

        Set<Person> persons = new HashSet<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        System.out.println(persons);
        System.out.println();
        for (Person p : persons
             ) {
            p.personIsMore20();
        }
        System.out.println();
        person5.changeStatus();
        System.out.println(person5);
        System.out.println();

        System.out.println(person1.canBeMarried(person3));
        System.out.println(person1.canBeMarried(person4));
        System.out.println(person6.canBeMarried(person2));
        System.out.println(person4.canBeMarried(person5));
    }
}