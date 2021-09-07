package LearningTest.IOTest;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/9/7 19:24
*/

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Summer
 * 一：流的分类
 * 1. 操作数据单位：字节流、字符流
 * 2. 数据的流向：输入流、输出流
 * 3. 流的角色：节点流、处理流
 * <p>
 * 抽象基类：      字节流：            缓冲流：
 * InputStream   FileInputStream   BufferedInputStream
 * OutputStream  FileOutputStream  BufferedOutputStream
 * Reader        FileReader        BufferedReader
 * Writer        FileWriter        BufferedWriter
 */
public class FileReaderWriterTest {

    /**
     * 将hello.txt中的内容读入程序中
     */
    @Test
    public void test() {
        FileReader fr = null;
        try {
            // 1. 指明要操作的文件
            File file1 = new File("D:\\Learning\\Workspace\\AlgorithmLearning\\src\\main\\java\\LearningTest\\IOTest\\hello.txt");
            System.out.println(file1.getAbsolutePath());
            // 2. 提供具体的流
            fr = new FileReader(file1);
            // 3. 数据的读入
            // read()返回读入的一个字符，如果达到文件末尾，返回-1
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.流的关闭操作
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 对read操作升级，使用read的重载方法
     */
    @Test
    public void test1() throws IOException {
        FileReader fr = null;
        try {
            // 1. File类的实例化
            File file1 = new File("D:\\Learning\\Workspace\\AlgorithmLearning\\src\\main\\java\\LearningTest\\IOTest\\hello.txt");
            // 2. FileReader流的实例化
            fr = new FileReader(file1);
            // 3. 读入的操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                // 错误的写法
                // helloworld123ld: 会将上一个world中的前三个字符擦除，再写为123，最终成了123ld
                // for (int i = 0; i < cbuf.length; i++) {
                //     System.out.print(cbuf[i]);
                // }

                // 正确的写法
                for (int i = 0; i < len; i++) {
                    // helloworld123
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    // 4. 资源的关闭
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
