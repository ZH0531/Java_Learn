package com.zh8888.Java_oop.Movie;

/**
 * 电影操作类：提供电影列表打印与按ID查询功能。
 * <p>
 * 使用方式：由外部传入 Movie[]，通过方法进行展示或查询。
 */
public class MovieOperator {
    private final Movie[] movies;

/**
     * 构造方法：注入要操作的电影数组。
     * <p>
     * @param movies 电影数组
     */
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    /**
     * 打印全部电影的基本信息（ID、名称、评分）。
     * <p>
     */
    public void printAllMovies() {
        System.out.println("--------------电影列表如下---------------");
        for (Movie m : movies) {
            System.out.print("ID：" + m.getId());
            System.out.print(" 动画名称：" + m.getName()+"\t");
            System.out.println("豆瓣评分：" + m.getScore());
            System.out.println("---------------------------------------");
        }
    }

    /**
     * 按ID查找并打印电影的详细信息；若未找到则提示。
     * <p>
     * @param id 电影ID
     */
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
