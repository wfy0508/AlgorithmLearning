package NewCode.ExceptionHandling;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/4 10:32
*/

public class UserDefineException {
    public static void main(String[] args){
        System.out.println("UserDefineException");
    }
}


// 自定义异常（根异常）
class BaseException extends RuntimeException{
    public BaseException(){
        super();
    }

    public BaseException(String message, Throwable cause){
        super(message, cause);
    }

    public BaseException(String message){
        super(message);
    }

    public BaseException(Throwable cause){
        super(cause);
    }

}