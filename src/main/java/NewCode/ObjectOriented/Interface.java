package NewCode.ObjectOriented;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 10:08
*/

public class Interface {
    public static void main(String[] args) {

    }
}

// 一个抽象类没有字段，只有抽象方法
abstract class Person7 {
    public abstract void run();

    public abstract String getName();
}

// 可以改写为一个接口（interface）
interface Person8 {
    // 接口不能拥有实例字段，只有抽象方法，抽象方法的类型默认定义为public abstract，可以省略不写
    void run();

    // 接口可以定义静态字段，默认都是public static final类型，编译器会自动加上
    int age = 8;

    String getName(String name);

    // default方法，不会强制子类覆写该方法，可以在需要的子类中进行覆写
    default void run1() {
        System.out.println("alternative method.");
    }
}

interface Hello1 {
    void hello();
}

// 一个接口可以继承另一个接口
interface Hello2 extends Hello1 {
    @Override
    void hello();
}

// 一个类只能继承一个类，但可以实现多个接口
class Student8 implements Person8, Hello1 {
    private String name;

    public Student8(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Student8 is running!");
    }

    @Override
    public String getName(String name) {
        return this.name;
    }

    @Override
    public void hello() {
        System.out.println("Hello, " + this.name);
    }
}

class Student9 implements Person8 {
    private String name;

    @Override
    public void run() {
        System.out.println("Student9 is running!");
    }

    @Override
    public String getName(String name) {
        return name;
    }

    // 覆写Person8的default方法
    @Override
    public void run1() {
        System.out.println("Student9 override run1");
    }
}