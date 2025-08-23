package com.zh8888.Java_Stream.Java_FileIO.释放资源的方式;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 释放资源的方式二：try-with-resources（JDK 7+）自动关闭资源示例。
 * <p>
 * 优点：
 * <p>
 * - 语法糖自动在作用域结束时调用 close()，无需 finally 判空；
 * <p>
 * - 多个资源可在同一个 try 头部声明，关闭顺序与声明的逆序一致；
 * <p>
 * - 更不易遗漏关闭、代码更简洁。
 */
public class Try_with_resource {
    public static void main(String[] args) {
        // 将需关闭的资源声明在 try 的括号中，作用域结束后会自动关闭
        // 什么资源可以放在这里？-继承了AutoCloseable的方法
        try (FileInputStream is = new FileInputStream("D:/Desktop/photo/头像2.jpg");
             FileOutputStream os = new FileOutputStream(
                     "learn_module/src/com/zh8888/Java_Stream/Java_FileIO/Stream/头像.png")) {

            // 一次性读完（示例用法，大文件时注意内存占用）
            byte[] bytes = is.readAllBytes();
            os.write(bytes);
        } catch (IOException e) {
            // 统一处理 I/O 异常
            throw new RuntimeException(e);
        }
    }
}
