package NewCode.CoreClass;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 16:36
*/

import java.util.StringJoiner;

public class stringJoiner {
    public static void main(String[] args) {
        String[] names = {"Bob", "Jack", "Tom"};
        // 设置连接符（，），开头（Hello），结尾（！）
        StringJoiner joiner = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner);
    }
}
