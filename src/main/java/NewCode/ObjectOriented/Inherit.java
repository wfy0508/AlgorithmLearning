package NewCode.ObjectOriented;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/28 15:10
*/

public class Inherit {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Tom", 22);
        Student2 s1 = new Student2("Jack", 32, 98.9);
        System.out.println(s1.getName());

        // 向上转型，Student2拥有Person2的全部功能，引用类型为Person2，指向Student2的实例
        Person2 p2 = new Student2("jack", 18, 99);
        if (p2 instanceof Student2) {
            Student2 s = (Student2) p2;
        }

    }
}


class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return getName() + " : " + getAge();
    }
}

class Student2 extends Person2 {
    private double score;
    private Book2 book; // 使用组合，Student2可以持有一个Book2的实例

    public Student2(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return super.getName() + " : " + super.getAge() + " : " + this.getScore();
    }
}

class Book2 {
    private String bookName;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return getBookName();
    }
}