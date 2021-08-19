package NewCode.ObjectOriented;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 9:39
*/

public class AbstractClass {
    public static void main(String[] args) {
        // 尽量使用抽象类去引用具体的子类的实例，这样不必关心具体的子类型
        Person6 s1 = new Student6();
        s1.run();
        Person6 t1 = new Teacher6();
        t1.run();
    }
}

abstract class Person6{
    // 如果父类不需要实现任何功能，只是定义一个方法签名，可以声明为一个抽象方法
    // 方法被定义为抽象方法，方法的类也需要声明为抽象类
    // 父类声明的抽象方法（定规范），子类必须覆写！
    public abstract void run();
}

class Student6 extends Person6{
    @Override
    public void run() {
        System.out.println("Student6 is running!");
    }
}

class Teacher6 extends Person6{
    @Override
    public void run() {
        System.out.println("Teacher6 is running!");
    }
}