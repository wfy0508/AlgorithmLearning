package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/10 11:08
*/

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class UseTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        // 写入无序
        treeMap.put("orange", 10);
        treeMap.put("apple", 20);
        treeMap.put("pear", 30);
        // 输出有序
        System.out.println(treeMap);
        // 使用TreeMap，放入的key必须事先Comparable接口，String， Integer这些类已经实现了Comparable接口
        Map<Person1, Integer> map = new TreeMap<>();
        map.put(new Person1("Tom"), 1);
        map.put(new Person1("Anna"), 2);
        map.put(new Person1("Lucky"), 3);
        for (Person1 key : map.keySet()) {
            System.out.println(key);
        }

        // 如果自定义的类没有实现ComParable接口，就需要制定排序方式
        Map<Person1, Integer> map1 = new TreeMap<>(new Comparator<Person1>() {
            public int compare(Person1 p1, Person1 p2) {
                return p1.name.compareTo(p2.name);
            }
        });
    }
}

class Person1 implements Comparable<Person1> {
    public String name;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{Person1:" + name + "}";
    }

    @Override
    public int compareTo(Person1 o) {
        return this.name.compareTo(o.name);
    }
}