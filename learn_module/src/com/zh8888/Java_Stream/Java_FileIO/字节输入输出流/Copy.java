package com.zh8888.Java_Stream.Java_FileIO.字节输入输出流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 文件拷贝示例：使用字节输入/输出流完成图片文件复制。
 * <p>
 * 说明：
 * <ul>
 *   <li>下方给出两种常见写法：按块读写（已注释掉）与一次性读完（当前使用）。</li>
 *   <li>在真实工程中建议使用 try-with-resources 自动关闭流，避免资源泄漏。</li>
 * </ul>
 */
public class Copy {
/**
     * 主程序入口：将源图片复制到目标路径。
     * <p>
     * @param args 命令行参数（未使用）
     * @throws Exception 文件读写异常
     */
    public static void main(String[] args) throws Exception {
        FileInputStream is = new FileInputStream("D:/Desktop/photo/头像2.jpg");
        OutputStream os = new FileOutputStream("learn_module/src/com/zh8888/Java_FileIO/Stream/头像.png");

//        // 分批次读取文件的字节
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = is.read(bytes)) != -1) {
//            os.write(bytes, 0, len);
//        }
//


        // 一次性读取文件的所有字节
        byte[] bytes = is.readAllBytes();
        os.write(bytes);
        System.out.println("复制完成");

        is.close();
        os.close();
    }
}
