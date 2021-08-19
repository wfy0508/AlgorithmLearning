package NewCode.Generic;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/9 10:06
*/

public class extendsAndSuperWildcard {
    public static void main(String[] args) {
        Pair2<Integer> p = new Pair2<>(123, 456);
        int n = add(p);
        System.out.println(n);

        p.setFirst(100);
        p.setSecond(100);
        int m = add(p);
        System.out.println(m);

        // 无限定通配符，Pair2<?>是所有Pair2<?>的超类
        Pair2<?> p1 = p;
        System.out.println(p1);

    }

    // 使用Pair2<? extends Number> p可以传入Number的子类
    // 如果使用Pair2<Number> p就只能传入Number类型的数据，不能转入其子类，因为Pair<Integer>不是Pair<Number>的子类
    static int add(Pair2<? extends Number> p) {
        Number first = p.getFirst(); // 只能给Number的引用变量赋值，因为只能确定返回的类型是Number的子类，但不知道具体的类型
        Number second = p.getSecond();

        // 不可以调用setFirst来设置first的值，因为不允许传入任何Number及其子类的数值
        // 原因在于擦拭法，如果传入的是Pair2<Double>，满足Pair2<? extends Number>，但是Pair2<Double>的setFirst不能接受Integer类型
        //p.setFirst(new Integer(100)+100);
        return first.intValue() + second.intValue();
    }

    // 如果想要接受Pair<Integer>及其父类的值，可以使用super通配符
    // 使用<? super Integer>代表只能写不能读
    static void setName(Pair2<? super Integer> p, Integer first, Integer second) {
        p.setFirst(first);
        p.setSecond(second);
        // NUmber first1 = p.getFirst(); 无法使用Number来接收getFirst()，只能使用Object来接收
        Object first1 = p.getFirst();
    }
}


class Pair2<T> {
    private T first;
    private T second;

    public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}