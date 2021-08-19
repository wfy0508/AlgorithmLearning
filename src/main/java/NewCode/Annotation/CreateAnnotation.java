package NewCode.Annotation;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/8 15:26
*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

public class CreateAnnotation {
    public static void main(String[] args) {

    }
}

// Target为元注解，定义注解可以使用的位置，下面表示注解使用在方法上
@Target(ElementType.METHOD)
@interface Report{
    int type() default 0;
    String level() default "info";
    String value() default "";
}

// 这类可以使用在方法和字段上
@Target({ElementType.METHOD, ElementType.FIELD})
@interface Report1{
    int type() default 0;
    String level() default "info";
    String value() default "";
}

// 其他注解
// @Retention 定义了注解的声明周期
   // @Retention(RetentionPolicy.RUNTIME) 运行期间使用
   // @Retention(RetentionPolicy.CLASS) 仅class文件
   // @Retention(RetentionPolicy.SOURCE) 仅编译期间
// @Inherited 定义了子类是否可以继承父类定义的注解，
// 仅对@Target(ElementType.Type)有效，并且仅针对class的继承，interface无效
@Inherited
@Target({ElementType.TYPE})
@interface Report2{
    int type() default 0;
    String level() default "info";
    String value() default "";
}