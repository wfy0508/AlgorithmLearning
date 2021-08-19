package NewCode.Annotation;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/8 15:41
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class HandleAnnotation {
    public static void main(String[] args) {

    }

    void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
        for (Field field : person.getClass().getFields()) {
            Range range = field.getAnnotation(Range.class);
            if (range != null) {
                Object value = field.get(person);
                if (value instanceof String) {
                    String s = (String) value;
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }
}

// 常用的注解是RUNTIME类型，经常使用，经常编写
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Range {
    int min() default 0;

    int max() default 10;
}

class Person {
    @Range(min = 1, max = 255)
    public String name;

    @Range(max = 10)
    public String city;
}