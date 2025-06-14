package com.zh8888.Java_oop.Interface.PeopleManager;

/**
 * 系统测试类
 * 启动学校信息管理系统进行功能验证
 */
public class Test {
    /**
     * 程序主入口
     *
     * @param args 命令行参数（未使用）
     *             启动ClassManager开始系统运行
     */
    public static void main(String[] args) {
        ClassManager classManager = new ClassManager();
        classManager.start();
    }
}