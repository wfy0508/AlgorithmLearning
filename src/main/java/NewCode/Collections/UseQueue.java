package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/24 15:01
*/

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue.add("apple"));
        System.out.println(queue.add("pear"));
        System.out.println(queue.poll()); // 获取首元素并删除
        System.out.println(queue.remove()); // 获取首元素并删除
        System.out.println(queue.poll());
        System.out.println(queue.add("orange"));
        System.out.println(queue.peek()); // 取出首元素但不删除
        System.out.println(queue.element());  // 取出首元素但不删除
        System.out.println(queue.poll());

        // 优先队列PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        // 输出的顺序和输出的顺序不一致，因为放入的String元素实现了Comparable接口，输出根据元素的优先级输出
        priorityQueue.add("apple");
        priorityQueue.add("pear");
        priorityQueue.add("banana");
        System.out.println(priorityQueue.poll()); // apple
        System.out.println(priorityQueue.poll()); // banana
        System.out.println(priorityQueue.poll()); // pear

        // 如果放入的元素没有实现Comparable接口，PriorityQueue提供了一个Comparator对象来判断两个元素的顺序
        PriorityQueue<User> userPriorityQueue = new PriorityQueue<>(new UserComparator());
        userPriorityQueue.add(new User("Tom", "A2"));
        userPriorityQueue.add(new User("Jack", "A1"));
        userPriorityQueue.add(new User("Lucy", "V1"));
        System.out.println(userPriorityQueue.poll());
        System.out.println(userPriorityQueue.poll());
        System.out.println(userPriorityQueue.poll());


    }
}

class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            return u1.number.compareTo(u2.number);
        }
        if (u1.number.charAt(0) == 'V') {
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "/" + number;
    }
}
