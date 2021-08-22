package LearningTest.GenericTest;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author yanlingwang
 */
public class GenericTest {
    @Test
    public void test(){
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
