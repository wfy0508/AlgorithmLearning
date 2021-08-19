package NewCode.ObjectOriented;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/27 15:34
*/

public class switchNewCode {
    public static void main(String[] args) {
        String fruit = "apple";
        // Java12 以后不需要break
        switch (fruit) {
            case "apple" -> System.out.println("apple");
            case "orange" -> System.out.println("orange");
            default -> System.out.println("no fruit selected");
        }

        // Java12 以后还可以直接将值输出
        String select = "1";
        int opt = switch (select) {
            case "1" -> 1;
            case "2" -> 2;
            default -> 0;
        };
        System.out.println(opt);
    }
}
