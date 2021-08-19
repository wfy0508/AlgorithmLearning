package NewCode.Reflection;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/8 14:43
*/

import javax.management.ObjectName;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static void main(String[] args) throws Throwable {
        // 通常情况下创建实例，并转型为接口来实现
        Hello helloWorld = new HelloWorld();
        helloWorld.morning("Tom");

        // 也可以在运行期间动态创建一个interface的实例
        // 不去编写实现类，而是直接通过JDK提供的Proxy.newProxyInstance()创建一个Hello对象
        // 这种没有实现类但是在运行期动态创建了一个接口对象的方式，我们称为**动态代码**。JDK提供的动态创建接口对象的方式，就叫**动态代理**

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };

        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new Class[]{Hello.class},
                handler);
        hello.morning("Bob");
    }
}

// 定义接口
interface Hello {
    void morning(String name) throws Throwable;
}

// 编写实现类
class HelloWorld implements Hello {
    public void morning(String name) {
        System.out.println("Good morning, " + name);
    }
}

// 将动态改为静态实现
class HelloDynamicProxy implements Hello {
    InvocationHandler handler;

    public HelloDynamicProxy(InvocationHandler handler) {
        this.handler = handler;
    }

    public void morning(String name) throws Throwable {
        handler.invoke(
                this,
                Hello.class.getMethod("morning"),
                new Object[]{name}
        );
    }

}
