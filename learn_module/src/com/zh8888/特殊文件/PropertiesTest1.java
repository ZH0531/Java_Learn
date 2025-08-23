package com.zh8888.特殊文件;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        //案例 检查test.properties文件里的内容有没有b 如果有把值改成18
        Properties properties = new Properties();

        properties.load(new FileReader("learn_module/src/com/zh8888/特殊文件/test.properties"));

        Boolean flag = false;
        if (properties.containsKey("bc")) {
            properties.setProperty("b", "18");
            System.out.println("查询成功,已修改");
            flag = true;
        }else  {
            properties.setProperty("张三","18");
            System.out.println("未查询到,已写入");
        }
        properties.store(new FileWriter("learn_module/src/com/zh8888/特殊文件/test.properties"), flag ?"修改成功":"写入成功");


    }

}
