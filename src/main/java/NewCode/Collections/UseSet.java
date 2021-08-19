package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/24 11:24
*/

import java.util.HashSet;
import java.util.TreeSet;

public class UseSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.add("abc")); // true
        System.out.println(set.add("xyz")); // true
        System.out.println(set.add("xyz")); // false
        System.out.println(set.contains("abc")); // true
        System.out.println(set.remove("xyz")); // true
        System.out.println(set.remove("xyz")); // false

        // TreeSet保证输出有序
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("pear");
        treeSet.add("apple");
        treeSet.add("orange");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
