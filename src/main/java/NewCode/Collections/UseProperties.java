package NewCode.Collections;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/6/21 17:28
*/

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class UseProperties {
    public static void main(String[] args) throws IOException {
        //Properties本质上是一个HashTable
        String f = "src/main/resources/setting.properties";
        Properties properties = new Properties();
        properties.load(new java.io.FileInputStream(f));
        properties.getProperty("lastOpenFile");
        properties.getProperty("AutoSaveInterval", "120");

        // 从内存读取字节流
        String str = "# test" + "\n" + "course=Java" + "\n" + "lastOpenDate=2021-06-21T18:16:12";
        ByteArrayInputStream input = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        Properties props = new Properties();
        props.load(input);

        System.out.println("course: " + props.getProperty("course"));
        System.out.println("lastOpenDate: " + props.getProperty("lastOpenDate"));
        System.out.println("autoSave: "+props.getProperty("autoSave", "60"));

        // 设置Properties
        Properties props1 = new Properties();
        props1.setProperty("url", "www.java.com");
        props1.setProperty("language", "Java");
        props1.store(new FileOutputStream("src/main/resources/setting.properties"), "这是写入的properties的注释");

    }
}
