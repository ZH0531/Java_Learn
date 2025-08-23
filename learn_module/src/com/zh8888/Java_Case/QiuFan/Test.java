package com.zh8888.Java_Case.QiuFan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int id = random.nextInt(1, 201);
            if (!list.contains(id)) {
                list.add(id);
            } else {
                i--;
            }
        }
        System.out.println(list);
        List<Integer> copy = new ArrayList<>(list);


        while (list.size() != 1) {
//            if (list.size() % 2 == 0) {
//                for (int i = list.size() - 2; i > 0; i -= 2) {
//                    list.remove(i);
//                }
//                System.out.println(list);
//            }
//            if (list.size() % 2 != 0 && list.size() > 1) {
//                for (int i = list.size() - 1; i >= 0; i -= 2) {
//                    list.remove(i);
//                }
//                System.out.println(list);
//            }
            for (int i = list.size() % 2 == 0 ? list.size() - 2 : list.size() - 1; i >= 0; i -= 2) {
                list.remove(i);
            }
            System.out.println(list);
        }
        for (int i = 0; i < copy.size(); i++) {
            if (list.get(0).equals(copy.get(i))) {
                System.out.println("最后剩下的是：" + list.get(0));
                System.out.println("第一次所占的位置是：" + (i + 1));
                break;
            }
        }
    }
}