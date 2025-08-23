package com.zh8888.Java_Stream.Java_FileIO.字节输入输出流;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * FileInputStream 文件输入流测试类
 * 演示了三种不同的文件读取方式：
 * 1. 逐字节读取（已注释）
 * 2. 缓冲区读取（已注释）
 * 3. 一次性读取所有字节（当前使用）
 *
 * @author zh8888
 */
public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        // 创建文件输入流，指向要读取的文件
        InputStream is = new FileInputStream("learn_module/src/com/zh8888/Java_FileIO/Stream/test.txt");

        // 方式一：逐字节读取文件内容
        // 优点：内存占用少
        // 缺点：效率较低，适合小文件
//        int b;
//        while ((b = is.read()) != -1)  // read()返回-1表示文件结束
//            System.out.print((char) b);  // 将字节转换为字符输出

        // 方式二：使用缓冲区读取文件内容
        // 优点：效率较高，适合大文件
        // 缺点：需要处理缓冲区大小和最后一次读取的字节数
//        byte[] bytes = new byte[30];  // 创建30字节的缓冲区
//        int len;  // 记录实际读取的字节数
//        while ((len = is.read(bytes)) != -1) {  // 读取数据到缓冲区
//            System.out.print(new String(bytes, 0, len));  // 只转换实际读取的字节
//            System.out.println("读取了"+len+"个字节");
//        }

        // 方式三：一次性读取所有字节（Java 9+）
        // 优点：代码简洁，适合小到中等大小的文件
        // 缺点：大文件可能导致内存不足
        byte[] bytes = is.readAllBytes();  // 读取文件的所有字节
        System.out.println(new String(bytes));  // 将字节数组转换为字符串输出

        // 关闭输入流，释放系统资源
        is.close();
    }
}
