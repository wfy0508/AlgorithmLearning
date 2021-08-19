package NewCode.CoreClass;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 18:10
*/

public class Enumeration {
    public static void main(String[] args) {
        WeekDay day = WeekDay.SUN;
        if (day == WeekDay.SAT || day == WeekDay.SUN) {
            System.out.println("Work at home");
        } else {
            System.out.println("Work at company");
        }

        // 打印常量名
        System.out.println(WeekDay.SUN.name());
        // 返回定义长亮的顺序，定义的改变顺序也会改变
        System.out.println(WeekDay.SUN.ordinal());

        WeekDay1 day1 = WeekDay1.SUN;
        System.out.println(day1.dayValue);

        // switch语句
        WeekDay1 day2 = WeekDay1.SUN;
        switch (day2) {
            case MON:
            case THE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day2 + ". Work at home.");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day2 + ". Work at home.");
                break;
            default:
                System.out.println("cannot process " + day2);
        }
    }
}

enum WeekDay {
    MON, THE, WED, THU, FRI, SAT, SUN;
}

// 定义枚举值的顺序和中文值
enum WeekDay1 {
    MON(1, "星期一"),
    THE(2, "星期二"),
    WED(3, "星期三"),
    THU(4, "星期四"),
    FRI(5, "星期五"),
    SAT(6, "星期六"),
    SUN(7, "星期日");

    public final int dayValue;
    private final String chinese;

    private WeekDay1(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }
}
