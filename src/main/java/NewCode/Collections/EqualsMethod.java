package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/9 16:25
*/

import java.util.List;
import java.util.Objects;

public class EqualsMethod {
    public static void main(String[] args) {
        List<String> str = List.of("apple", "orange", "pear");
        System.out.println(str.contains("banana")); // false
        System.out.println(str.indexOf("pear")); // 2

        // new String("apple")和List中的apple是不同的实例，但也返回了true
        // List内部使用的是equals而不是==来判断两个元素是否相等
        System.out.println(str.contains(new String("apple"))); // true

    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }
}
