package com.zh8888.Java_Stream.Java_FileIO.File;

/**
 * 递归方程示例：猴子吃桃问题的逆向求解。
 * <p>
 * 设 f(x) 表示第 x 天开始时桃子数量，已知 f(10)=1，满足：
 * <pre>f(x) = 2 * f(x+1) + 2</pre>
 */
public class Monkey {
    //f(10)=1
    //f(x) - f(x) / 2 - 1 = f(x + 1)
    //2f(x) -f(x) - 2 = 2f(x + 1)
    //f(x) = 2f(x + 1) + 2
    //f(1)=?
    public static void main(String[] args) {
        System.out.println(f(1));
    }

    private static int f(int x) {
        if (x == 10) {
            return 1;
        } else {
            return 2 * f(x + 1) + 2;
        }
    }


}
