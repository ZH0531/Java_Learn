package com.zh8888.Java_API.String.Login;

public class LoginOperator {
    private final Login[] users;

    public LoginOperator(Login[] users) {
        this.users = users;
    }

    /**
     * @return true: 需要继续输入（验证失败）
     *         false: 停止循环（验证成功）
     */
    public boolean isLoginFailed(String userName, String password) {

        for (Login c : users) {
            if (c.getUserName().equalsIgnoreCase(userName)) {
                if (c.getPassword().equalsIgnoreCase(password)) {
                    System.out.println("登录成功！");
                    return false;
                } else {
                    System.out.println("密码错误！");
                    return true;
                }
            }
        }
        System.out.println("无该用户！");
        return true;
    }
}
