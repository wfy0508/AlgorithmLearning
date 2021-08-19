package NewCode.Generic;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/9 11:15
*/

public class GenericAndReflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class clazz = String.class;
        String s1 = (String) clazz.newInstance();

        Class<String> clazz1 = String.class;
        String s2 = clazz1.newInstance();

    }
}
