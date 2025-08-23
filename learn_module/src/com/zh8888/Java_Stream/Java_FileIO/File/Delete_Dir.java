package com.zh8888.Java_Stream.Java_FileIO.File;

import java.io.File;

/**
 * 递归删除目录示例：演示如何安全地删除目录及其子文件/子目录。
 * <p>
 * 提示：实际工程应谨慎使用，删除前建议二次确认或加入白名单机制。
 */
public class Delete_Dir {
/**
     * 程序入口：调用递归删除方法删除指定目录。
     * <p>
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        deleteDir(new File("D:"+File.separator+"测试"));

    }
/**
     * 递归删除指定文件或目录。
     * <p>
     * 处理逻辑：
     * <ol>
     *   <li>空/不存在直接返回；</li>
     *   <li>文件直接删除；</li>
     *   <li>目录则先删除子项再删除自身。</li>
     * </ol>
     * @param dir 目标文件/目录
     */
    public static void deleteDir(File dir) {
        if (dir == null || !dir.exists()) {
            return;
        }
        if (dir.isFile()) {
            System.out.println("删除：" + dir.getAbsolutePath());
            System.out.println("结果：" + dir.delete());
        }
        File[] files = dir.listFiles();

        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                System.out.println("删除：" + file.getAbsolutePath());
                System.out.println("结果：" + file.delete());
                System.out.println("--------------------");
            } else if (file.isDirectory()) {
                deleteDir(file);
            }
        }
        System.out.println("删除：" + dir.getAbsolutePath());
        System.out.println("结果：" + dir.delete());
    }
}
