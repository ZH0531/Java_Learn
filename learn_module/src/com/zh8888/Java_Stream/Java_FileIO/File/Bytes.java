package com.zh8888.Java_Stream.Java_FileIO.File;

import java.util.Arrays;

/**
 * 字节与字符串转换示例：展示 String 与 byte[] 的相互转换及打印。
 * <p>
 * 注意：不同平台默认字符集可能不同，实际工程中建议显式指定字符集（如 UTF-8）。
 */
public class Bytes {
/**
     * 主程序：将字符串转为字节数组再还原，观察字节表示与解码结果。
     * <p>
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        String a = "我喜欢你";
        byte[] b = a.getBytes();
        System.out.println(Arrays.toString(b));

        String s = new String(b);
        System.out.println(s);
    }
}
