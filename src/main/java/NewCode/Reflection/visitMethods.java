package NewCode.Reflection;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/7 15:02
*/

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class visitMethods {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class cls = Student1.class;
        System.out.println(cls.getMethod("getScore", String.class));
        System.out.println(cls.getMethod("getName"));
        System.out.println(cls.getDeclaredMethod("getGrade", int.class));

        // 获取方法后，可以调用一个Method的所有信息
        Method method = cls.getMethod("getScore", String.class);
        System.out.println(method.getName());
        System.out.println(method.getReturnType());
        System.out.println(method.getParameterTypes());
        System.out.println(method.getModifiers());

        // 当获取到一个Method对象时，就可以对它进行调用
        String s = "Hello, world";
        String r = s.substring(6);

        // 如果用反射方法来调用substring
        Method m = String.class.getMethod("substring", int.class);
        String r1 = (String) m.invoke(s, 6);

        // 调用静态方法，invoke的第一个参数永远为null
        Method m1 = Integer.class.getMethod("parseInt", String.class);
        Integer n = (Integer) m1.invoke(null, "12345");

        // 调用非public方法，直接调用会抛出IllegalAccessException，需要Method.setAccessible(true)
        Person1 p = new Person1();
        Method m2 = p.getClass().getDeclaredMethod("setName", String.class);
        m2.setAccessible(true);
        m2.invoke(p, "Bob");
        System.out.println(p.getName());


    }
}

class Person1 {
    private String name;

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }
}

class Student1 extends Person1 {
    public int getScore(String type) {
        return 99;
    }

    private int getGrade(int year) {
        return 1;
    }
}