package NewCode.Reflection;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/8 9:49
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class visitConstructor {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person2 p1 = new Person2("Tom");
        //Person2 p2 = Person2.class.newInstance(); // 只能调用public无参构造方法，其他不适用

        // 可以使用反射调用Constructor对象，它包含后一个构造方法的所有信息
        Constructor cons1 = Integer.class.getConstructor(int.class);
        Object instance = (Integer) cons1.newInstance(123);
        System.out.println(instance);
    }
}


class Person2 {
    private final String name;

    public Person2(String name) {
        this.name = name;
    }
}