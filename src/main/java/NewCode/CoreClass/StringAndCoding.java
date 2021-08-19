package NewCode.CoreClass;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 15:15
*/

import java.util.Arrays;
import java.util.Locale;

public class StringAndCoding {
    public static void main(String[] args) {
        // String是一个引用类，本身也是一个class，String内部由char[]数组表示
        // String一个重要特点是“不可变”，内部实现时没有任何修改char[]的实现
        String s = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println(s);

        // 字符串比较：实际上是要比较两个字符串的内容是否相等，应使用equals而不是==
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 也返回true，实际上是巧合

        String s3 = "Hello".toLowerCase();
        System.out.println(s1 == s3); // 返回false
        System.out.println(s2.equals(s3));

        String s4 = "Hello";
        System.out.println(s1.equalsIgnoreCase(s4)); // 忽略大小写比较


        int[] scores = new int[]{89, 30, 88, 90, 78};
        Score score = new Score(scores);
        score.printScores();
        scores[2] = 100;
        score.printScores();
    }
}


class Score {
    private int[] scores;

    public Score(int[] scores) {
        int[] temp = new int[scores.length];
        for (int i = 0; i <= scores.length - 1; i++) {
            temp[i] = scores[i];
            this.scores = temp;
        }
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
