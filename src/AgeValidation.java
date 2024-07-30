// Age Validation (Underage):Write a Predicate<Person> that returns true if a person's age is less than
// 18.Use this predicate to filter a list of Person objects and print those who are younger than 18.

import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


public class AgeValidation {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Ali", 17), new Person("Ahmed", 7), new Person("Johnson", 25), new Person("Sophia", 37), new Person("Brown", 16));
        List<Person> underAge = personList.stream().filter(age -> age.getAge() < 18).toList();
        System.out.println(underAge);
    }
}
