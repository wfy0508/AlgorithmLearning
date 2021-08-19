package NewCode.Generic;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/8 18:12
*/

public class CodeGeneric {
    public static void main(String[] args) {
        // T不能是基本类型，例如int，因为实际类型是Object，Object无法持有基本类型
        Pair<String, Integer> pair = new Pair<>("Bob", 30);
        System.out.println(pair.getName() + ": " + pair.getAge());
        System.out.println(Pair.create("Tom", 20).getName());

        // 无法取得带泛型的Class
        Pair<Integer, Integer> pair1 = new Pair<>(123, 456);
        Pair<String, String> pair2 = new Pair<>("123", "456");
        System.out.println(pair1.getClass() == pair2.getClass()); // true
        System.out.println(pair1.getClass() == Pair.class); // true

        // 不能使用instanceof来判断泛型的Class
        // if (pair1 instanceof Pair<Integer, Integer>.class) 编译错误

        // 不能直接实例化T类型，new T()，因为擦拭后编程new Object()，很显然是不行的
    }
}

class TestPair<T, K>{
    private T name;
    private K age;

    public TestPair(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        name = clazz.newInstance(); // 要实例化T类型，我们必须借助额外的Class参数
        age = (K) clazz.newInstance();
    }
}


class Pair<T, K> {
    private T name;
    private K age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public K getAge() {
        return age;
    }

    public void setAge(K age) {
        this.age = age;
    }

    public Pair(T name, K age) {
        this.name = name;
        this.age = age;
    }

    // 定义静态泛型方法应该使用其他类型区分
    public static <M, N> Pair<M, N> create(M name, N age) {
        return new Pair<>(name, age);
    }
}