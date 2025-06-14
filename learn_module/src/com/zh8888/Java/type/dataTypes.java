package com.zh8888.Java.type;

public class dataTypes {
    public static void main(String[] args) {
//        1.整数 byte short int long
        byte b = 127;
        byte by = -128;  // -128~127

        short s = 13145;

        int i = 1314520;
//      注意:随便写一个整型字面量默认是int类型的，123456789410虽然没有超过long的范围，但是超过了本身int类型的范围
//      如果希望随便写一个整型字面量默认是long类型的，需要在后面加上L/l
        long l = 12345678910L;

//        2.小数 float double
//        注意:随便写小数字面量，默认是double，如果希望小数是float，后面加上F/f
        float f = 3.14F;

        double d = 13.14;

//        3.字符 char
        char c = 'a';
        char c2 = '爱';

//        4.布尔 boolean
        boolean bo = true;
        boolean bo2 = false;

//        5.引用 String 记得大写
        String S = "haha";
    }
}
