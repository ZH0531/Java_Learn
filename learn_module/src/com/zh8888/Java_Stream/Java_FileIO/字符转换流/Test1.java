package com.zh8888.Java_Stream.Java_FileIO.字符转换流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        try (InputStream is = new FileInputStream("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/字符转换流/Test1.txt");
             OutputStream os = new FileOutputStream("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/字符转换流/Test2.txt");
             InputStreamReader isr = new InputStreamReader(is,"GBK");
             OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8)
        ) {
            char[] bytes = new char[1024];
            int len;
            while ((len = isr.read(bytes)) != -1) {
                osw.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
