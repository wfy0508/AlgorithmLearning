package NewCode.ExceptionHandling;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/4 9:41
*/

public class RaiseException {
    public static void main(String[] args) throws Exception {
        process1();

        /*Exception origin = null;
        try{
            System.out.println(Integer.parseInt("123"));
        }catch (Exception e){
            origin  = e;
            throw e;
        }finally {
            Exception e = new IllegalArgumentException();
            if(origin != null){
                e.addSuppressed(origin); // 将被屏蔽的异常添加进来
            }
            throw e;
        }*/
    }

    static void process1() {
        try {
            process2("null");
        } catch (NumberFormatException e) {
            System.out.println("catched!");
            //throw new IllegalArgumentException(); // 转换了异常，这样就丢失了原始异常信息
            throw new IllegalArgumentException(e); // 将原始异常信息实例传进去，就可以持有原始异常信息
        } finally {
            System.out.println("finally");
            //throw new IllegalArgumentException(); // 在finally中抛出异常，原来catch的异常就会被屏蔽，因为只能抛出一个异常
        }
    }

    static void process2(String s) {
        if (s == null) {
            throw new NumberFormatException();
        } else {
            System.out.println(s);
        }
    }
}
