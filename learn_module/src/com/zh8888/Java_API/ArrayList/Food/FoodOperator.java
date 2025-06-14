package com.zh8888.Java_API.ArrayList.Food;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FoodOperator {
    ArrayList<Food> foodList;

    public FoodOperator(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }

    public void addFood() {
        while (true) {
            Food food = new Food();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入菜品名称：");
            food.setName(sc.nextLine());

            double price;
            while (true) {
                System.out.println("请输入菜品价格：");
                try {
                    price = sc.nextDouble();
                    sc.nextLine();
                    if (price <= 0) {
                        System.out.println("价格必须大于0！请重新输入！");
                        continue;
                    }
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("输入有误！请重新输入！");
                    sc.nextLine();
                }


            }
            food.setPrice(price);


            System.out.println("请输入菜品介绍：");
            food.setInfo(sc.nextLine());
            foodList.add(food);
            System.out.println("添加成功！");
            System.out.println("是否继续添加？(Y/N)");
            if (sc.next().equalsIgnoreCase("N")) {
                System.out.println("添加结束！即将返回主菜单");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return;
            }
        }
    }

    public void showFood() {
        if (foodList.isEmpty()) {
            System.out.println("暂无菜品！请先添加菜品！");
            System.out.println("正在返回主菜单...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        System.out.println("======菜品列表======");
        for (Food food : foodList) {
            System.out.println(food.getName() + "：" + food.getPrice() + "元\n" + food.getInfo());
            System.out.println("--------------------");
        }
    }

    public void deleteFood() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n====删除操作列表====\n1.精准删除(完整菜品名)\n2.模糊删除(部分菜品名)\n3.返回主菜单");
            String choice = sc.next();
            if (choice.equals("3")) {
                System.out.println("返回成功！");
                return;
            }
            System.out.println("请输入要删除的菜品名称：");
            String name = sc.next();
            boolean flag = false;
            switch (choice) {
                case "1":
                    for (Food f : foodList) {
                        if (f.getName().equals(name)) {
                            System.out.println("已删除：" + foodList.remove(f));
                            System.out.println("--------------------");
                            flag = true;
                        }
                        if (!flag) {
                            System.out.println("未找到该菜品！");
                        }
                    }
                    break;
                case "2":
                    for (Food f : foodList) {
                        if (f.getName().contains(name)) {
                            System.out.println("已删除：" + foodList.remove(f));
                            System.out.println("--------------------");
                            flag = true;
                        }
                        if (!flag) {
                            System.out.println("未找到该菜品！");
                        }
                    }
                    break;
                default:
                    System.out.println("输入错误！请重新选择！");
                    break;
            }
            System.out.println("是否继续删除？(Y/N)");
            String continueDelete = sc.next();
            if (continueDelete.equalsIgnoreCase("N")) {
                System.out.println("删除结束！即将返回主菜单");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return;
            }
        }
    }

    public void start() {
        System.out.println("欢迎使用菜品上架系统！");
        while (true) {
            System.out.print("====主菜单====\n1.添加菜品\n2.显示菜品\n3.删除菜品\n4.退出\n请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addFood();
                    break;
                case "2":
                    showFood();
                    break;
                case "3":
                    deleteFood();
                    break;
                case "4":
                    System.out.println("退出成功！");
                    return;
                default:
                    System.out.println("输入错误！请重新选择！");
                    break;
            }
        }
    }
}
