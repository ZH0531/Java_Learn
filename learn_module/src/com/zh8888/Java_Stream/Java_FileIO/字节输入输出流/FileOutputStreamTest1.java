package com.zh8888.Java_Stream.Java_FileIO.字节输入输出流;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 文件输出流示例：演示按字节/字符串向文件追加写入。
 * <p>
 * 注意：Windows 换行通常使用\r\n，这里演示写入回车换行符号；实际工程建议使用缓冲与try-with-resources。
 */
public class FileOutputStreamTest1 {
/**
     * 主程序：以追加方式向示例文件写入不同形式的数据。
     * <p>
     * @param args 命令行参数（未使用）
     * @throws Exception IO异常
     */
    public static void main(String[] args) throws Exception {

        OutputStream os = new FileOutputStream("learn_module/src/com/zh8888/Java_FileIO/Stream/test2.txt", true);

        os.write("\r\n".getBytes());
        os.write(97);
        os.write('b');
        os.write("我喜欢你abc".getBytes(),3,9);

        os.close();
    }
}
