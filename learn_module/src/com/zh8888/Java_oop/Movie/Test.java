package com.zh8888.Java_oop.Movie;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "熊出没\t\t", 9.8, 5.20, "张三", "李四", "188.8万人想看");
        movies[1] = new Movie(2, "喜羊羊与灰太狼", 9.6, 6.66, "王五", "赵六", "160.0万人想看");
        movies[2] = new Movie(3, "巴啦啦小魔仙", 9.5, 8.88, "钱七", "孙八", "120.0万人想看");
        movies[3] = new Movie(4, "电击小子\t", 9.4, 9.99, "李九", "周十", "100.0万人想看");

        MovieOperator operator = new MovieOperator(movies);

        while (true) {
            System.out.println("===电影信息系统===");
            System.out.println("1、查询全部电影信息");
            System.out.println("2、查询某部电影详情");
            System.out.println("3、退出系统");
            System.out.println("请输入操作命令1/2/3：");
            int command = sc.nextInt();
            if (command == 1) {
                operator.printAllMovies();
            } else if (command == 2) {
                System.out.println("请输入要查看详情的影片id：");
                int searchId = sc.nextInt();
                operator.searchMoviesById(searchId);
            } else if (command == 3) {
                break;
            } else {
                System.out.println("输入错误，请重新输入！");
            }
        }
    }
}
