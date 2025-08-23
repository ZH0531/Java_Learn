package com.zh8888.Java_Stream.Java_FileIO.释放资源的方式;

import java.io.*;

/**
 * 释放资源的方式一：try-catch-finally 手动关闭资源示例。
 * <p>
 * 演示要点：
 * <p>
 * - 在 try 中完成文件拷贝逻辑；
 * <p>
 * - 在 finally 中判空并关闭 I/O 资源，确保无论是否异常都能释放；
 * <p>
 * - 这里故意使用 10/0 触发 ArithmeticException（不属于 IOException），
 *   因此 is、os 在 finally 中仍为 null，if (… != null) 分支将不会进入；
 * <p>
 * - 实际工程中通常更推荐 try-with-resources，代码更简洁、安全。
 */
public class Try_catch_finally {
    public static void main(String[] args) {
        // 先声明，便于 finally 中判空关闭
        InputStream is = null;
        OutputStream os = null;
        try {
            // 人为制造运行时异常：ArithmeticException。
            // 由于下面仅捕获 IOException，该异常会直接跳转到 finally，
            // 因此资源创建语句不会执行，is、os 保持为 null。
            System.out.println(10 / 0);

            // 资源创建（本例中不会执行到）
            is = new FileInputStream("D:/Desktop/photo/头像2.jpg"); // 输入流：源文件
            os = new FileOutputStream("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/Stream/头像.png"); // 输出流：目标文件

            // 拷贝：一次性读完（仅示例，注意大文件内存占用）
            byte[] bytes = is.readAllBytes();
            os.write(bytes);
        } catch (IOException e) {
            // 这里只捕获 I/O 异常，算术异常不会被捕获
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally"); // finally 块一定会执行

            // 关闭顺序建议：先输出流再输入流；判空避免 NPE
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                // 关闭时的异常处理通常应记录日志，避免掩盖原始异常
                throw new RuntimeException(e);
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
