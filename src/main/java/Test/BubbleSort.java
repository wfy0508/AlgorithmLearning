package Test;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/7/15 14:26
*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] originArrays = {9, 4, 23, 7, 19, 10, 3, 8, 24};
        System.out.println("originArray: " + Arrays.toString(originArrays));
        for (int i = 0; i <= originArrays.length - 1; i++) {
            for (int j = i + 1; j <= originArrays.length - 1; j++) {
                if (originArrays[i] < originArrays[j]) {
                    int temp = originArrays[j];
                    originArrays[j] = originArrays[i];
                    originArrays[i] = temp;
                }
            }
        }
        System.out.println("sortedArray: " + Arrays.toString(originArrays));
    }
}
