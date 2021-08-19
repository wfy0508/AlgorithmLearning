package NewCode.ExceptionHandling;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/3 16:51
*/

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class catchException {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }

    public static byte[] toGBK(String s) {
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            System.out.println(e);
            return s.getBytes();
        }
    }

}
