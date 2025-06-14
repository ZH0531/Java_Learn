package com.zh8888.Java_oop.Movie;

public class MovieOperator {
    private final Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        System.out.println("--------------电影列表如下---------------");
        for (Movie m : movies) {
            System.out.print("ID：" + m.getId());
            System.out.print(" 动画名称：" + m.getName()+"\t");
            System.out.println("豆瓣评分：" + m.getScore());
            System.out.println("---------------------------------------");
        }
    }

    public void searchMoviesById(int id) {
        for (Movie m : movies) {
            if (id == m.getId()) {
                System.out.println("--------------------");
                System.out.println("ID：" + m.getId());
                System.out.println("动画名称：" + m.getName());
                System.out.println("豆瓣评分：" + m.getScore());
                System.out.println("全片价格：" + m.getPrice());
                System.out.println("导演：" + m.getDirector());
                System.out.println("主演：" + m.getActor());
                System.out.println("其他信息：" + m.getInfo());
                System.out.println("--------------------");
                return;
            }
        }
        System.out.println("没有找到该ID的电影");
    }
}
