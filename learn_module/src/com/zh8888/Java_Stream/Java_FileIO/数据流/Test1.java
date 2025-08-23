package com.zh8888.Java_Stream.Java_FileIO.数据流;

import java.io.*;

/**
 * 学习笔记：数据流（DataInputStream / DataOutputStream）
 * <p>作用：以二进制、安全、跨平台的方式读写 Java 基本类型与字符串
 * <p>注意：与对象序列化不同，它只处理基本类型/UTF 字符串
 */
public class Test1 {
    public static void main(String[] args) {
        File file = new File("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/数据流/data.bin");

        // 写：按固定顺序写入各种数据类型
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(42);
            dos.writeDouble(Math.PI);
            dos.writeBoolean(true);
            dos.writeUTF("你好, DataStream"); // 修改UTF编码格式（变长）
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 读：必须按相同顺序与类型读出
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int n = dis.readInt();
            double d = dis.readDouble();
            boolean b = dis.readBoolean();
            String s = dis.readUTF();
            System.out.println("read => " + n + ", " + d + ", " + b + ", " + s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 小结：
        // - 写入顺序与读取顺序必须完全一致，否则抛 EOFException 或读到脏数据
        // - 适用于轻量级的二进制协议/缓存文件/简单持久化
        // - 与文本文件不同，无法直接用记事本查看
    }
}

