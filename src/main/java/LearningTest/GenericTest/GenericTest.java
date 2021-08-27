package LearningTest.GenericTest;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author yanlingwang
 */
public class GenericTest {
    @Test
    public void test() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-90);
        list.add(100);
        list.add(-234);
        list.add(23);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

class Person<K, V> {
    private K name;
    private V age;

    public Person(K name, V age) {
        this.name = name;
        this.age = age;
    }

    public void setName(K name) {
        this.name = name;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public K getName() {
        return name;
    }

    public V getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}


class Person1 implements Comparable<Object>{
    String name;
    int age;

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person1){
            Person1 person1 = (Person1) o;
            return this.name.compareTo(person1.name);
        }else {
            throw new RuntimeException("输入类型不一致！");
        }
    }
}
