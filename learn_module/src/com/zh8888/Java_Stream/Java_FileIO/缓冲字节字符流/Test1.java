package com.zh8888.Java_Stream.Java_FileIO.缓冲字节字符流;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {

        try (FileInputStream is = new FileInputStream("D:/Desktop/photo/头像2.jpg");
             FileOutputStream os = new FileOutputStream("learn_module" +
                     "/src/com/zh8888/Java_Stream/Java_FileIO/缓冲字节字符流/tx.png");
             BufferedInputStream bis = new BufferedInputStream(is);
             BufferedOutputStream bos = new BufferedOutputStream(os)
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
