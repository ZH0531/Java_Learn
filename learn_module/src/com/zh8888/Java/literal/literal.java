package com.zh8888.Java.literal;

//字面量
public class literal {
    public static void main(String[] args) {
//      1.整数
        System.out.println(520);
//      2.小数
        System.out.println(13.14);
//      3.字符：必须要用单引号围起来，有且只能有一个字符
        System.out.println('a');
        System.out.println(0);
        System.out.println('中');
//        System.out.println('中国');
        System.out.println(' ');   // 空字符
//        System.out.println('');  必须包含内容
//      特殊的字符：\n 代表换行的意思  \t代表的是一个tab
        System.out.println('中');
        System.out.println('\n');  // println本身代表输出后换行，\n再次换行，所以换两行
        System.out.println('国');
        System.out.println('\t');
//      4.字符串，必须用双引号包起来，里面的内容可以随意
        System.out.println("我爱你1314.520");
        System.out.println(" ");
        System.out.println("");// 空字符串
//      5.布尔值，只有两个值：true false
        System.out.println(true);
        System.out.println(false);
    }
}
