package com.zh8888.Java_Stream.Java_FileIO.序列化流;

import java.io.*;
import java.util.Objects;

/**
 * 学习笔记：对象序列化流（ObjectOutputStream / ObjectInputStream）
 * <p>作用：将对象转为字节序列持久化/网络传输，再恢复为对象
 */
public class Test1 {
    public static void main(String[] args) {
        File file = new File("learn_module/src/com/zh8888/Java_Stream/Java_FileIO/序列化流/person.bin");

        // 写对象：类必须实现 Serializable，且建议声明 serialVersionUID
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            Person p = new Person("HanHan", 23);
            oos.writeObject(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 读对象：类在类路径可见，且 serialVersionUID 一致
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Person read = (Person) ois.readObject();
            System.out.println("read => " + read);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 小结：
        // - transient 字段不会被序列化；static 字段也不会
        // - 修改类结构需保持 serialVersionUID 不变，否则读取老数据会 InvalidClassException
        // - 可自定义 writeObject/readObject 做定制化序列化（谨慎）
    }

    // 演示用的可序列化类
    private static class Person implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

