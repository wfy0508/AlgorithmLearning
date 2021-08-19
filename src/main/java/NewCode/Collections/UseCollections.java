package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/24 16:39
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCollections {
    public static void main(String[] args) {
        // Collections是JDK提供的一个工具类，提供了一系列静态方法，能更方便地操作各种集合
        // 创建空集合
        List<String> emptyList = Collections.emptyList();

        // 创建单元素集合
        List<String> singletonList = Collections.singletonList("apple");

        //排序
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("pear");
        arrayList.add("apple");
        arrayList.add("orange");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // 洗牌
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
