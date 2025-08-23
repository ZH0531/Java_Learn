package com.zh8888.Java_Stream.Java_FileIO.File;

public class PiJiu {
    //啤酒问题:啤酒2元一瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，请问10元可以喝多少瓶?
    static int money = 10;
    static int count = 0;
    static int count2 = 0;
    static int count3 = 0;

    public static void main(String[] args) {
        System.out.println("当前余额：" + money);
        System.out.println("开始喝啤酒...");
        drink();
        System.out.println("--------------------");
        System.out.println("总共喝了" + count + "瓶啤酒，剩余" + count2 + "个盖子，" + count3 + "个空瓶。");
        System.out.println("--------------------");
        Borrow();
    }

    private static void Borrow() {
        if (count2 == 3 && count3 == 1) {
            System.out.println("向隔壁老王借了2元");
            money += 2;
            drink();
            System.out.println("把第" + count + "瓶啤酒还给老王抵钱");
            count--;
            count2--;
            count3--;
            System.out.println("总共喝了" + count + "瓶啤酒，剩余" + count2 + "个盖子，" + count3 + "个空瓶。");
            Borrow();
        } else if (count2 == 2 && count3 == 0) {
            System.out.println("向隔壁老王借了4元");
            money += 4;
            while (money >= 2) {
                money -= 2;
                count++;
                count2++;
                count3++;
                System.out.println("买了第" + count + "瓶啤酒\t喝完剩余" + count2 + "个盖子，" + count3 + "个空瓶。余额：" + money);
            }
            System.out.println("刚好剩余4个瓶盖和2个瓶子，兑换两瓶啤酒给老王抵钱");
            count2 -= 4;
            count3 -= 2;
            System.out.println("总共喝了" + count + "瓶啤酒，剩余" + count2 + "个盖子，" + count3 + "个空瓶。");
        }
    }

    private static void drink() {
        while (money >= 2) {
            money -= 2;
            count++;
            count2++;
            count3++;
            System.out.println("买了第" + count + "瓶啤酒\t喝完剩余" + count2 + "个盖子，" + count3 + "个空瓶。余额：" + money);

        }
        while (count2 >= 4) {
            count2 -= 4;
            count++;
            count2++;
            count3++;
            System.out.println("用4个瓶盖换了第" + count + "瓶啤酒 \t喝完剩余" + count2 + "个盖子，" + count3 + "个空瓶。");
            drink();
        }
        while (count3 >= 2) {
            count3 -= 2;
            count++;
            count2++;
            count3++;
            System.out.println("用2个瓶子换了第" + count + "瓶啤酒 \t喝完剩余" + count2 + "个盖子，" + count3 + "个空瓶。");
            drink();
        }
    }
}
