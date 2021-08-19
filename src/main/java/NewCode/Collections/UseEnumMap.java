package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/10 11:00
*/

import java.time.DayOfWeek;
import java.util.EnumMap;

public class UseEnumMap {
    public static void main(String[] args) {
        EnumMap<DayOfWeek, String> enumMap = new EnumMap<>(DayOfWeek.class);
        enumMap.put(DayOfWeek.MONDAY, "星期一");
        enumMap.put(DayOfWeek.TUESDAY, "星期二");
        enumMap.put(DayOfWeek.WEDNESDAY, "星期三");
        enumMap.put(DayOfWeek.THURSDAY, "星期四");
        enumMap.put(DayOfWeek.FRIDAY, "星期五");
        enumMap.put(DayOfWeek.SATURDAY, "星期六");
        enumMap.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(enumMap);
        System.out.println(enumMap.get(DayOfWeek.MONDAY));
    }
}
