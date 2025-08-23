package com.zh8888.Java_Stream.Java_FileIO.字符输入输出流;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest1 {
    public static void main(String[] args) {
        try (Reader fr = new FileReader
                ("learn_module\\src\\com\\zh8888\\Java_Stream\\Java_FileIO\\字符输入输出流\\Test1.txt")) {
//            int c;
//            while ((c = fr.read()) != -1) {
//               System.out.print((char) c);
//            }
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                System.out.print(new String(chars, 0, len));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
