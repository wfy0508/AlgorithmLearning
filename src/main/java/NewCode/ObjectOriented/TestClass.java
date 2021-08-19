package NewCode.ObjectOriented;/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/26 15:27
*/

import java.util.Calendar;

public class TestClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setBirthYear(2022);
        person.setName("xiao ming");
        System.out.println(person);

    }
}

class Person {
    private String name;
    private int age;
    private int birthYear;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return calcAge(getBirthYear());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("invalid input age");
        }
        this.age = age;
    }

    public void setBirthYear(int birthYear) {
        Calendar now = Calendar.getInstance();
        if (birthYear < 0 || birthYear > now.get(Calendar.YEAR)) {
            throw new IllegalArgumentException("Invalid input birthYear!");
        }
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    private int calcAge(int birthYear) {
        Calendar curYear = Calendar.getInstance();
        return curYear.get(Calendar.YEAR) - getBirthYear();
    }

    @Override
    public String toString() {
        return getName() + ":" + getAge();
    }
}
