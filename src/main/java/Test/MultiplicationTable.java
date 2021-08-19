package Test;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/7/13 14:04
*/

/**
 * 打印9*9乘法表
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

}
