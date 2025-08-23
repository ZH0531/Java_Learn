package com.zh8888.Java_Case.String;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        List<User> userList = new ArrayList<>();
        String[] userStrsInfo = userStrs.split("#");
        for (String userStr : userStrsInfo) {
            String[] userInfo = userStr.split(":");
            User user = new User();
            user.setId(Long.parseLong(userInfo[0]));
            user.setName(userInfo[1]);
            user.setSex(userInfo[2]);
            LocalDate birthday = LocalDate.parse(userInfo[3]);
            user.setBirthday(birthday);
            userList.add(user);
        }
        System.out.println(userList);

        Map<String, Integer> userMap = new HashMap<>();
        for (User user : userList) {
            String name = user.getName();
            if (userMap.containsKey(name)) {
                userMap.put(name, userMap.get(name) + 1);
            } else {
                userMap.put(name, 1);
            }
        }
        userMap.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
