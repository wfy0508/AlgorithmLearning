package NewCode.Generic;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/9 9:43
*/

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericInherit {
    public static void main(String[] args) {
        // 通过子类获取父类的泛型（较麻烦）
        Class<IntPair1> clazz = IntPair1.class;
        Type t = clazz.getGenericSuperclass();
        if (t instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) t;
            Type[] types = pt.getActualTypeArguments();
            Type firstType = types[0];
            Class<?> typeclass = (Class<?>) firstType;
            System.out.println(typeclass);

        }
    }
}


class Pair1<T, K> {
    private T name;
    private K age;

    public Pair1(T name, K age) {
        this.name = name;
        this.age = age;
    }
}

class IntPair1 extends Pair1<String, Integer> {
    public IntPair1(String name, Integer age) {
        super(name, age);
    }
}