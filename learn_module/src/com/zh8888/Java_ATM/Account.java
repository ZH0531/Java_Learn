package com.zh8888.Java_ATM;

public class Account {
    private String cardID;
    private String name;
    private String password;
    private int money;
    private int quota;
    private String gender;

    public Account() {
    }

    public Account(String cardID, String name, String password, int money, int quota, String gender) {
        this.cardID = cardID;
        this.name = name;
        this.password = password;
        this.money = money;
        this.quota = quota;
        this.gender = gender;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public String getGender() {
        return gender;

    }

    public String Gender() {
        return gender.equals("男") ? "先生" : "女士";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
