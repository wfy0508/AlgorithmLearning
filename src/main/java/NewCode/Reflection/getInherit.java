package NewCode.Reflection;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/8 11:19
*/

public class getInherit {
    public static void main(String[] args) {
        // 获取父类class
        Class i = Integer.class;
        Class n = i.getSuperclass();
        System.out.println(n); // Number
        Class o = n.getSuperclass();
        System.out.println(o); // Object
        System.out.println(o.getSuperclass()); // null

        // 获取当前类实现的接口
        Class m = Integer.class;
        Class[] m1 = m.getInterfaces(); // 只包含当前类实现的接口，并不包括父类实现的接口
        for (Class k : m1) {
            System.out.println(k);
        }

        // 对所有interface的Class调用getSuperClass()返回的都是null
        // 获取接口的父接口要用getInterfaces()
        System.out.println(java.io.DataInputStream.class.getSuperclass());
        System.out.println(java.io.Closeable.class.getSuperclass());
    }
}
