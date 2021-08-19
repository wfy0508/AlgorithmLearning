package NewCode.CoreClass;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 17:20
*/

public class WrapperClass {
    public static void main(String[] args) {
        int i = 100;
        // 通过new操作符创建Integer实例(不推荐使用,会有编译警告)
        Integer n1 = new Integer(i);
        System.out.println(n1);

        // 通过Integer的valueOf创建Integer实例
        Integer n2 = Integer.valueOf(i);
        System.out.println(n2);

        // 通过静态方法valueOf(String)创建Integer实例
        Integer n3 = Integer.valueOf("100");
        System.out.println(n3);

        // AutoBoxing
        int j = 100;
        Integer n4 = Integer.valueOf(j);
        Integer n5 = j; // 等同上面操作，编译器自动使用Integer.valueOf(j)装箱
        int m1 = n5.intValue();
        int m2 = n5; // 等同上面操作，编译器自动使用Integer.intValue(n5)拆箱

        // 所有的包装类型都是不变类，对两个Integer实例对象进行比较，不能使用==，只能使用equals
        Integer x = 127;
        Integer y = 127;
        Integer m = 9999;
        Integer n = 9999;
        System.out.println("x==y: " + (x == y)); // true, 为了节省内存，编译器对于较小的数，始终返回相同的实例，“恰好”相等
        System.out.println("x equals y: " + x.equals(y)); // true
        System.out.println("m==n: " + (m == n)); // false
        System.out.println("m equals n: " + m.equals(n)); // true
    }
}