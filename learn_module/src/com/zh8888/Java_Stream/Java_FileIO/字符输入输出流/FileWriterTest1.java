package com.zh8888.Java_Stream.Java_FileIO.字符输入输出流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest1 {
    public static void main(String[] args) {
        try( Writer fr = new
                FileWriter("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/字符输入输出流/Test2.txt",true)) {
            fr.write('a');
            fr.write("\r\n");
            fr.write("我喜欢你");
            fr.write("\r\n");
            fr.write("我喜欢你",0,3);
            fr.write("\r\n");
            char[] chars = {'a','我','c'};
            fr.write(chars);
            fr.write("\r\n");
            fr.write(chars,1,2);


            fr.flush();//
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
