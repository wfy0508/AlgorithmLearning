package Algorithm;/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/27 11:06
*/

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int a = 99;
        int b = 15;
        int result = gcd(a, b);
        System.out.println(a + "和" + b + "的最大公约数为：" + result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        int r = a % b;
        return gcd(b, r);
    }
}
