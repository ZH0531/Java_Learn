package com.zh8888.Java_Stream.Java_FileIO.打印流;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 学习笔记：打印流（PrintStream / PrintWriter）
 * <p>作用：便捷打印（格式化、自动换行、自动刷新）、可重定向输出到文件
 */
public class Test1 {
    public static void main(String[] args) {
        // 1) 使用 PrintStream 打印到文件（追加、自动刷新、指定编码）
        try (FileOutputStream fos = new FileOutputStream(
                "learn_module/src/com/zh8888/Java_Stream/Java_FileIO/打印流/print.txt", true);
             PrintStream ps = new PrintStream(fos, true, StandardCharsets.UTF_8)) {
            ps.println("Hello 打印流");
            ps.printf("score=%d, pi=%.2f%n", 100, Math.PI);
            ps.println("自动换行 + 自动刷新示例");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 2) 重定向 System.out 到文件，再恢复到控制台
        PrintStream old = System.out;
        try (PrintStream ps = new PrintStream(
                new FileOutputStream("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/打印流/sysout.log"),
                true, "UTF-8")) {
            System.setOut(ps);
            System.out.println("这行会写入 sysout.log 文件");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.setOut(old);
            System.out.println("重定向结束，回到控制台输出");
        }

        // 3) 使用 PrintWriter（同样支持格式化与自动刷新）
        try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/打印流/pw.txt"),
                        StandardCharsets.UTF_8),
                true)) {
            pw.println("PrintWriter 也很常用，适合配合字符流");
            pw.printf("%-6s:%d%n", "age", 23);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 小结：
        // - PrintStream 以字节为底层，PrintWriter 以字符为底层
        // - 都支持 print/println/printf，方便日志/结果输出
        // - 可指定编码、是否自动刷新（autoFlush=true）
    }
}

