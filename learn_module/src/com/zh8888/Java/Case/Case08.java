package com.zh8888.Java.Case;

import java.util.Random;
import java.util.Scanner;


public class Case08 {
    /**
     * 双色球 投注号码由 6个红色球号码和 1个蓝色 球号码组成。红色球号码从1-33中选择；蓝色球号码从1-16中选择
     * 1. 随机生成6个红球号码和1个蓝球号码，红球号码为1-33，蓝球号码为1-16
     * 2. 输入6个红球号码和1个蓝球号码
     * 3. 判断红球号码和蓝球号码是否正确，并给出相应的奖金
     */

    public static void main(String[] args) {
        int[] luckNum = getluck();
        int[] userNum = getuser();
        result(userNum, luckNum);
    }


    private static int[] getuser() {
        Scanner s = new Scanner(System.in);
        int[] userNum = new int[7];
        for (int i = 0; i < userNum.length; i++) {
            System.out.println(i == 6 ? "请输入最后一个蓝色球号码：" : "请输入第" + (i + 1) + "个红色球号码：");
            int num = s.nextInt();
            if (i >= 0 && i < 6 && num >= 1 && num <= 33) {
                userNum[i] = num;
            } else if (i == 6 && num >= 1 && num <= 16) {
                userNum[i] = num;
            } else {
                System.out.println("号码不符合，请重新输入");
                i -= 1;
                continue;
            }
            int count = 0;
            if (i < 6) {
                for (int j = 0; j <= i; j++) {
                    if (userNum[i] == userNum[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("号码重复，请重新输入!");
                    i -= 1;
                }
            }
        }
        Case05.printArray(userNum);
        return userNum;
    }

    private static int[] getluck() {
        Random r = new Random();
        int[] luckNum = new int[7];
        for (int i = 0; i < 6; i++) {
            int num1 = r.nextInt(1, 34);
            luckNum[i] = num1;

            int count = 0;
            for (int j = 0; j < 6; j++) {
                if (luckNum[i] == luckNum[j]) {
                    count++;
                }
            }
            if (count > 1) {
                i -= 1;
            }
        }
        luckNum[6] = r.nextInt(1, 17);
        Case05.printArray(luckNum);
        return luckNum;
    }

    private static void result(int[] userNum, int[] luckNum) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < userNum.length; i++) {
            for (int j = 0; j < luckNum.length - 1; j++) {
                if (i < 6 && userNum[i] == luckNum[j]) {
                    count1++;
                }
            }
        }
        if (userNum[6] == luckNum[6]) {
            count2++;
        }
        if (count1 == 6 && count2 == 1) {
            System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得最高奖金888888元！");
        } else if (count1 == 6) {
            System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金10000元！");
        } else if (count1 == 5 && count2 == 1) {
            System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金188888元！");
        } else if (count1 == 5 || count1 == 4 && count2 == 1) {
            System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金1000元！");
        } else if (count1 == 4 || count1 == 3 && count2 == 1) {
            System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金500元！");
        } else if (count1 < 3 && count2 == 1) {
            System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金100元！");
        } else {
            System.out.println("很遗憾，您中了" + count1 + "个红球，" + count2 + "个蓝球，无奖金！");
        }

        switch (count2) {
            case 0:
                switch (count1) {
                    case 0, 1, 2:
                        System.out.println("很遗憾，您中了" + count1 + "个红球，" + count2 + "个蓝球，无奖金！");
                        break;
                    case 3:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金100元！");
                        break;
                    case 4:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金500元！");
                        break;
                    case 5:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金1000元！");
                        break;
                    case 6:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金10000元！");
                        break;
                }
                break;
            case 1:
                switch (count1) {
                    case 0, 1, 2:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，奖金50元！");
                        break;
                    case 3:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金888元！");
                        break;
                    case 4:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金8888元！");
                        break;
                    case 5:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得奖金188888元！");
                        break;
                    case 6:
                        System.out.println("恭喜您，中了" + count1 + "个红球，" + count2 + "个蓝球，获得最高奖金888888元！");
                        break;
                }
        }
    }
}
