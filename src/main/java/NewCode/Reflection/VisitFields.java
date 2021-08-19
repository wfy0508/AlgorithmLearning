package NewCode.Reflection;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/4 17:43
*/

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class VisitFields {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdCLass = Student.class;
        // 获取public字段score
        System.out.println(stdCLass.getField("score")); // getField获取public字段（包括父类）
        // 获取继承的public字段name
        System.out.println(stdCLass.getField("name"));
        // 获取private字段grade
        System.out.println(stdCLass.getDeclaredField("grade")); // getDeclaredField获取所有的字段（不包括父类）

        Field value = String.class.getDeclaredField("value");
        System.out.println(value.getName());
        System.out.println(value.getType()); //  class [B 表示byte[]类型
        int i = value.getModifiers();
        System.out.println(Modifier.isFinal(i)); // true
        System.out.println(Modifier.isPrivate(i)); // true
        System.out.println(Modifier.isProtected(i)); // false
        System.out.println(Modifier.isStatic(i)); // false

    }
}

class Person{
    public String name;
}

class Student extends Person{
    public int score;
    private int grade;
}
