package NewCode.Reflection;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/4 15:40
*/

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        String hello = new String("hello");
        System.out.println(hello);

        // 通过Class的实例获取class信息的方法称为反射（Reflection）
        // 3种不同方式实现反射
        Class cls1 = String.class;
        Class cls2 = "Hello".getClass();
        Class cls3 = Class.forName("java.lang.String"); // 通过静态方法Class.forName

        // 因为Class在JVM中是唯一的，可以使用==来比较两个Class实例
        boolean sameClass = cls1 == cls2;
        System.out.println(sameClass); // true
    }
}
