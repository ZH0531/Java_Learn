package com.zh8888.Java_Stream.Java_FileIO.缓冲字节字符流;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {

        try (Reader is = new FileReader("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/缓冲字节字符流/test.txt");
             Writer os = new FileWriter("learn_module" +
                     "/src/com/zh8888/Java_Stream/Java_FileIO/缓冲字节字符流/test2");
             BufferedReader br = new BufferedReader(is);
             BufferedWriter bw = new BufferedWriter(os)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();//换行
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
