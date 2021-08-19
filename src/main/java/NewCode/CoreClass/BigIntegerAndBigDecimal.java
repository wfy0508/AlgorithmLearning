package NewCode.CoreClass;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/3 14:59
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigIntegerAndBigDecimal {
    public static void main(String[] args) {
        // CPU原生支持最大范围64位的long型整数，如果超过64位可以使用BigInteger，可以表示任意大小的整数
        BigInteger pi = new BigInteger("123456789");
        System.out.println(pi.pow(5));

        // BigInteger做计算时，只能使用实例方法，如加法运算
        BigInteger i = new BigInteger("123456789000");
        BigInteger j = new BigInteger("10987654321");
        BigInteger sum = i.add(j);
        System.out.println(sum);

        // BigInteger转换为long类型
        // longValue
        System.out.println(i.multiply(i).longValue()); // 会丢失高位信息，造成数据不准确

        // longValueExact 会保证数据准确，但超出长度会报错 ArithmeticException
        try {
            System.out.println(i.multiply(i).longValueExact());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        // BigDecimal表示任意大小且精度完全准确的浮点数
        BigDecimal d1 = new BigDecimal("123.45678");
        System.out.println(d1.scale());
        System.out.println(d1.multiply(d1));
        System.out.println(d1.multiply(d1).scale());

        // stripTrailingZeros转化为一个格式相同，但末尾去掉了0的BigDecimal
        BigDecimal d2 = new BigDecimal("123456000");
        System.out.println(d2.scale());
        BigDecimal d3 = d2.stripTrailingZeros();
        System.out.println(d3.scale()); // -3, 表示BigDecimal类型的整数去掉了低位的3个0

        // BigDecimal做加、减，乘运算时，精度不会丢失，但是做除法时，出现除不尽的情况是，需要指定精度
        BigDecimal d4 = new BigDecimal("123.789");
        BigDecimal d5 = new BigDecimal("456.7820");
        BigDecimal result = d4.divide(d5, 10, RoundingMode.HALF_UP);
        System.out.println(result);

        // divideAndRemainder会返回商和余数
        BigDecimal[] dr = d4.divideAndRemainder(d5);
        if(dr[1].signum() == 0){
            System.out.println("d4 is divided exactly by d5!");
        }

        // 比较BigDecimal，使用compareTo
        // 必须使用compareTo()方法来比较，它根据两个值的大小分别返回负数、正数和0，分别表示小于、大于和等于
        BigDecimal d6 = new BigDecimal("123.456");
        BigDecimal d7 = new BigDecimal("123.45600");
        System.out.println(d6.equals(d7)); // false,因为scale不同
        System.out.println(d6.equals(d7.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为2
        System.out.println(d6.compareTo(d7)); // 0
    }
}
