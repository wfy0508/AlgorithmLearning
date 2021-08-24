package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/9 17:53
*/

import edu.princeton.cs.algs4.In;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Student s1 = new Student("Tom", 99);
        HashMap<String, Student> map1 = new HashMap<>();
        map1.put("Tom", s1);
        Student target = map1.get("Tom");
        System.out.println(target == s1); // true
        System.out.println(target.score); // 99
        Student bob = map1.get("Bob");
        System.out.println(bob); // null，未找到

        // HashMap中的key不会重复，但是value无所谓
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 123);
        hashMap.put("apple", 456); // apple对应的value会变为456
        System.out.println(hashMap.get("apple"));
        hashMap.put("pear", 789);
        hashMap.put("orange", 678);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // 编写equals和hashCode方法
        HashMap<String, Student> map2 = new HashMap<>();
        String key1 = "a";
        map2.put(key1, new Student("Tom", 20));
        map2.put("b", new Student("Jack", 21));
        map2.put("c", new Student("Bob", 22));
        String key2 = new String("a");
        map2.put(key2, new Student("Tom", 20));
        System.out.println(key1 == key2); // false
        System.out.println(key1.equals(key2)); // true
    }
}

class Student {
    public String name;
    public int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}