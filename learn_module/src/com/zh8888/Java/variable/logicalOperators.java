package com.zh8888.Java.variable;

public class logicalOperators {
    public static void main(String[] args) {
        boolean a = 2 > 1 & 3 > 2; // true & true = true
        System.out.println(a); // true
        // 1. & 运算符：只有两个操作数都为 true，结果才为 true，否则为 false。

        boolean b = 2 > 1 | 2 > 3; // true | false = true
        System.out.println(b); // true
        // 2. | 运算符：只要两个操作数有一个为 true，结果就为 true，否则为 false。

        boolean c = 2 > 1 ^ 3 > 2; // true ^ true = false
        System.out.println(c); // false
        // 3. ^ 运算符：只有两个操作数的结果不同时为 true，否则为 false。

        boolean d = !(2 > 1); // !(true) = false
        System.out.println(d); // false
        // 4. ! 运算符：对操作数取反，true 变 false，false 变 true。

        boolean e = 2 > 1 && 3 > 2; // true && true = true
        System.out.println(e); // true
        // 5. && 运算符：和 & 运算符一样 只不过左边为 false 右边不计算。

        boolean f = 2 > 1 || 3 > 2; // true || false = true
        System.out.println(f); // true
        // 6. || 运算符：和 | 运算符一样 只不过左边为 true 右边不计算。

        // 结论：
        // 1. & 运算符：只有两个操作数都为 true，结果才为 true，否则为 false。
        // 2. | 运算符：只要两个操作数有一个为 true，结果就为 true，否则为 false。
        // 3. ^ 运算符：只有两个操作数的结果不同时为 true，否则为 false。
        // 4. ! 运算符：对操作数取反，true 变 false，false 变 true。
        // 5. && 运算符：和 & 运算符一样 只不过左边为 false 右边不计算。
        // 6. || 运算符：和 | 运算符一样 只不过左边为 true 右边不计算。
        // 7. 短路运算符：左边的操作数已经可以决定结果，右边的操作数就不再计算了。

    }
}
