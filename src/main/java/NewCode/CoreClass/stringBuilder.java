package NewCode.CoreClass;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/5/31 16:04
*/

public class stringBuilder {
    public static void main(String[] args) {
        String s = "";
        for (int i = 1; i <= 1000; i++) {
            s = s + "," + i; // 每次都要创建一个新的String对象，不但浪费内存，还影响GC效率
        }
        System.out.println(s);

        // 使用StringBuilder构建，只创建一次，多次使用
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            sb.append(",")
                    .append(i); // 链式操作
        }
        System.out.println(sb);

        // 链式操作
        Adder adder = new Adder();
        adder.add(3)
                .inc()
                .inc()
                .add(10);
        System.out.println(adder.value());
    }
}


class Adder {
    private int sum = 0;

    public Adder add(int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum++;
        return this;
    }

    public int value() {
        return sum;
    }
}
