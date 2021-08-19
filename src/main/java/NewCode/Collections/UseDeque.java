package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/24 15:36
*/

import java.util.Deque;
import java.util.LinkedList;

public class UseDeque {
    public static void main(String[] args) {
        Deque<Object> deque = new LinkedList<>();
        deque.addFirst("apple");
        deque.addLast("pear");
        deque.addFirst("pear");
        System.out.println(deque.pollFirst());
        System.out.println(deque.poll());
        System.out.println(deque.pollLast());


    }
}
