package NewCode.ObjectOriented;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 10:54
*/

public class StaticFieldAndMethod {
    public static void main(String[] args) {
        Person10 p1 = new Person10("xiao ming", 22);
        Person10 p2 = new Person10("xiao hong", 33);

        // 静态字段不属于实例，只有一个“共享”的空间，指向的都是Person10 class
        // 写为p1.number也会自动转换为Person10.number
        // 编译器可以根据实例类型自动转换为“类名.静态字段”来访问静态对象
        Person10.number = 10; // 不要使用p1.number
        System.out.println(Person10.number);
        Person10.number = 20;
        System.out.println(Person10.number);

        // 静态方法调用不需要实例变量，通过类名就可以调用
        Person10.setNumber(100);
        System.out.println(Person10.number);

    }
}

class Person10 {
    public String name;
    public int age;
    public static int number;

    public Person10(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setNumber(int value){
        number = value;
    }

}
