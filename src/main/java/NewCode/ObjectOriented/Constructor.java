package NewCode.ObjectOriented;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/27 18:05
*/

public class Constructor {
    public static void main(String[] args) {
        Person1 person1 = new Person1("xiaoming", 22);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person1 p2 = new Person1("xiaoming");
        System.out.println(p2.getName());
        System.out.println(p2.getAge());

        Hello h1 = new Hello();
        h1.hello();
        h1.hello("Jack");
        h1.hello("Tom", 22);

    }
}

class Person1 {
    private String name;
    private int age;

    // 默认构造方法
    public Person1() {
        this("Unnamed"); // 调用自定义构造方法2

    }

    // 自定义构造方法1
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 自定义构造方法2
    public Person1(String name) {
        this(name, 12); // 调用自定义构造方法1
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

// 方法重载： 方法名称相同，参数不同
class Hello {

    public void hello() {
        System.out.println("Hello, world!");
    }

    public void hello(String name) {
        System.out.println("hello, " + name);
    }

    public void hello(String name, int age) {
        if (age > 18) {
            System.out.println("Hi, " + name);
        } else {
            System.out.println("Hello, " + name);
        }
    }
}
