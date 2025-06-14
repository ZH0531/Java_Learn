package com.zh8888.Java_oop.Interface.PeopleManager;

/**
 * 数据添加操作接口
 * @param <E> 需要添加的数据类型
 */
public interface Add<E> {
    /**
     * 添加指定类型的数据
     * @param e 需要添加的数据对象
     * @return 添加后的数据对象
     */
    E add(E e);
}