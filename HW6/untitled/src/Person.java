import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String sex;
    private String marriedStatus;
    private String citizenShip;

    public Person(String name, String surname, int age, String sex, String marriedStatus, String citizenShip) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.marriedStatus = marriedStatus;
        this.citizenShip = citizenShip;
    }

    public Person(String name, String surname, int age, String sex) {
        this(name, surname, age, sex, "N/A", "N/A");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getMarriedStatus() {
        return marriedStatus;
    }

    public String getCitizenShip() {
        return citizenShip;
    }

    @Override
    public String toString() {
        return String.format("name - " + name + " || surname - " + surname + " || sex- " + sex + " || married status - " + marriedStatus + " || age - " + age + " || citizenShip - " + citizenShip + "\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person otherPerson = (Person) obj;
        return name.equals(otherPerson.name) && surname.equals(otherPerson.surname) && age == otherPerson.age && sex.equals(otherPerson.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, sex);
    }

    public void personIsMore20() {
        if (age >= 20) {
            System.out.println("name - " + name + " || surname - " + surname + " || age - " + age + " Is more than 20");
        }
    }

    public void changeStatus() {
        System.out.println("name - " + name + " || surname - " + surname + " || married status - " + marriedStatus);
        Map<Integer, String> marStatus = new HashMap<>();
        marStatus.put(1, "single");
        marStatus.put(2, "married");
        marStatus.put(3, "divorced");
        System.out.println("Type number  - " + marStatus);
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        marriedStatus = marStatus.get(n);
    }

    public boolean canBeMarried(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            System.out.println("Only persons can be married!");
            return false;
        }
        Person otherPerson = (Person) obj;
        if (sex.equals(otherPerson.sex) && (citizenShip != "USA" || otherPerson.citizenShip != "USA")) {
            if(citizenShip != "USA") System.out.println("No gay marriage in " + citizenShip);
            if(otherPerson.citizenShip != "USA") System.out.println("No gay marriage in " + otherPerson.citizenShip);
            return false;
        } else if (marriedStatus == "married" || otherPerson.marriedStatus == "married") {
            if (marriedStatus == "married") {
                System.out.println("name - " + name + " || surname - " + surname + " already married!");
            }
            if (otherPerson.marriedStatus == "married") {
                System.out.println("name - " + otherPerson.name + " || surname - " + otherPerson.surname + " already married!");
            }
            return false;
        } else if (age < 18 || otherPerson.age < 18) {
            if (age < 18) {
                System.out.println("name - " + name + " || surname - " + surname + " is to young!");
            }
            if (otherPerson.age < 18) {
                System.out.println("name - " + otherPerson.name + " || surname - " + otherPerson.surname + " is to young!");
            }
            return false;
        }
return true;
    }
}