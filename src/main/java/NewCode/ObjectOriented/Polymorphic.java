package NewCode.ObjectOriented;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/28 17:42
*/

public class Polymorphic {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Income(10000),
                new Salary(10000),
                new StateCouncilSpecialAllowance(6000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total += income.getTax();
        }
        return total;
    }
}

// 基本税率为10%
class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1;
    }
}

// 工资5000一下不交税，5000以上缴纳10%
class Salary extends Income {

    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.1;
    }
}

// 享受国务院津贴的不交税
class StateCouncilSpecialAllowance extends Income {

    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}


// 覆写Object的方法
// 1. toString
// 2. equals
// 3. hashCode

class Person4 {
    private final String name;

    public Person4(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person's name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        // 当且仅当o是Person4类型
        if (o instanceof Person4) {
            Person4 p = (Person4) o;
            // 并且name的字段值相同
            return this.name.equals(p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

// 定义为final类型
class Person5 {
    public final void run() {
        System.out.println("Person5 is running!");
    }
}

class Student5 extends Person5 {
    public void run1() {
        super.run();
    }
}