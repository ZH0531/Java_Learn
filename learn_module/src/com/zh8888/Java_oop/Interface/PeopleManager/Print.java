package com.zh8888.Java_oop.Interface.PeopleManager;

import java.util.ArrayList;

/**
 * 打印操作接口
 * @param <E> 被打印数据的类型
 */
public interface Print<E> {
    /**
     * 打印指定类型的数据列表
     * @param list 需要打印的数据列表
     */
    void print(ArrayList<E> list);
}