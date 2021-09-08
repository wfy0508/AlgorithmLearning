package LearningTest.IOTest;
/*
    PROJECT_NAME: AlgorithmLearning
    User: Summer
    Create time: 2021/9/7 19:24
*/

import org.junit.Test;

import java.io.*;

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
            File file1 = new File("hello1.txt");
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
            File file1 = new File("hello1.txt");
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

    /**
     * 从内存写入到硬盘
     */
    @Test
    public void test2() throws IOException {
        // 1. 指明写出的文件
        // 没有则创建，有则覆盖
        File file = new File("hello2.txt");
        // 2. 提供FileWriter对象
        // 为true则追加内容
        FileWriter fw = new FileWriter(file, true);
        // 3. 写出的操作
        fw.write("FileWriter test successful!\n");
        // 4. 资源的关闭
        fw.close();
    }

    /**
     * 从硬盘写入到内存，再从内存写到硬盘
     */
    @Test
    public void test3() throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            // 1. 指明源文件和目标文件
            File srcFile = new File("hello1.txt");
            File destFile = new File("hello2.txt");

            // 2. 提供FileWriter对象和FileReader对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            // 3. 读入和写出的操作
            int len;
            char[] cbuf = new char[5];
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4. 资源的关闭
        try {
            if (fw != null) {
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (fr != null) {
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 图片的复制(字节流)
     */
    @Test
    public void test4() throws IOException {
        // 1. 指定源文件和目标文件
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcJpg = new File("google.jpg");
            File destJpg = new File("google1.jpg");

            // 2. 指定FileInputStream和FileOutputStream对象
            fis = new FileInputStream(srcJpg);
            fos = new FileOutputStream(destJpg);

            // 3. 读入和写出操作
            byte[] byteArray = new byte[5];
            int len;
            while ((len = fis.read(byteArray)) != -1) {
                fos.write(byteArray, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
