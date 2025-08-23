package com.zh8888.Java_Stream.Java_FileIO.File;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File_Search {
    static int count = -1;
    static List<File> results = new ArrayList<>();
    static long startTime;
    static long endTime;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要搜索的目录：");
        File dir = new File(sc.nextLine());

        System.out.println("请输入要搜索的文件名：");
        String filename = sc.nextLine();

        search(dir, filename);
        endTime = System.nanoTime();
        System.out.println("搜索完成！");
        double durationInSeconds = (double) (endTime - startTime) / 1_000_000_000.0;
        String formattedDuration = String.format("%.2f", durationInSeconds);
        System.out.println("搜索耗时: " + formattedDuration + " 秒");
        if (count == 0) {
            System.out.println("未找到文件！");
        } else {
            System.out.println("正在整理列表...");
            Thread.sleep(1000);
            System.out.println();
            System.out.println("文件目录列表：");
            System.out.println("--------------------");
            results.forEach(r -> System.out.println(r.getAbsolutePath()));
            System.out.println("--------------------");
            System.out.println("找到了" + count + "个文件！");
        }
    }


    /**
     * 在指定目录及其子目录中搜索具有给定文件名的文件，并输出其绝对路径。
     *
     * @param dir      要搜索的起始目录
     * @param filename 要查找的文件名称
     *                 <p>
     *                 说明：
     *                 - 如果目录不存在或无效，则直接返回
     *                 - 会递归搜索所有子目录
     *                 - 找到匹配文件时输出完整绝对路径
     */

    public static void search(File dir, String filename) {
        if (count == -1) {
            System.out.println("搜索开始...");
            System.out.println("当前搜索的目录是：" + dir.getAbsolutePath());
            System.out.println("当前搜索的文件名是：" + filename);
            count++;
            startTime = System.nanoTime();
        }
        if (dir == null || !dir.exists() || !dir.isDirectory()) {
            System.out.println("目录不存在或无效！");
            return;
        }
        // 获取当前目录下所有文件和子目录
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // 检查文件名匹配
                    if (file.getName().toLowerCase().contains(filename.toLowerCase())) {// 忽略大小写 模糊查询
                        count++;
                        System.out.println("找到了第" + count + "个文件：" + file.getAbsolutePath());
                        results.add(file);
                    }
                } else if (file.isDirectory()) {
                    // 递归搜索子目录
                    search(file, filename);
                }
            }
        }

    }
}