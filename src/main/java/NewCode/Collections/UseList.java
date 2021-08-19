package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/9 15:27
*/

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        System.out.println(list.size());

        // 遍历List
        // 这种方法不是很高效，对于数据量较大的LinkedList，速度较慢
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        // 使用迭代器遍历
        // 使用迭代器遍历会针对不同的List，总是具有最高的效率
        List<String> list1 = List.of("Apple", "Orange", "Pear", "Banana");
        for(Iterator<String> it = list1.iterator(); it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }

        // for each会自动变成Iterator的调用
        for (String s : list) {
            System.out.println(s);
        }

        // List转换为Array
        Object[] array = list1.toArray();
        for(Object a: array){
            System.out.println(a);
        }

        List<Integer> list2 = List.of(12,34,56,78,90);
        Integer[] array1 = list2.toArray(new Integer[list2.size()]);
        for(Integer a: array1){
            System.out.println(a);
        }

        // Array转List
        List<Integer> list3 = List.of(array1);

    }
}
