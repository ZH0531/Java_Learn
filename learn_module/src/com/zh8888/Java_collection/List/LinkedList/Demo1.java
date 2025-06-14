package com.zh8888.Java_collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //队列 先进先出
        LinkedList<String> queue = new LinkedList<>();//此处不可用List接口 因为无法使用子类独有方法
        queue.addLast("张三");// 入队
        queue.addLast("李四");
        queue.addLast("王五");
        queue.addLast("赵六");
        System.out.println(queue);

        System.out.println(queue.removeFirst()); //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue);


        //栈 先进后出
        LinkedList<String> stack = new LinkedList<>();
        stack.addFirst("A");//入栈(push)
        stack.addFirst("B");
        stack.addFirst("C");
        stack.addFirst("D");
        System.out.println(stack);

        System.out.println(stack.removeFirst());//出栈(pop)
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);
        System.out.println("-----------------------");

        //栈的push和pop方法
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);


    }
}
