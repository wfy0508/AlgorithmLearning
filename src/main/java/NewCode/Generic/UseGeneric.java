package NewCode.Generic;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/8 16:35
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseGeneric {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // 无类型强制转换
        String first = list.get(0);
        String second = list.get(1);

        ArrayList<Number> list1 = new ArrayList<>();
        list1.add(new Integer(123));
        list1.add(new Double(123.456));
        Number first1 = list1.get(0);
        Number second1 = list1.get(1);

        // 向上转型时，List<Number>就自动推断出后面的ArrayList<T>中T的类型为Number，这是就可以省略Number
        List<Number> list2 = new ArrayList<>();


        Person[] person = new Person[]{
                new Person("Tom", 20),
                new Person("Jack", 30),
                new Person("Bob", 40),
        };
        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }
}


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "," + this.age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}