package com.zh8888.Java.Case;

public class Case01 {
    /**
     * 用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，优惠方案如下：
     * 5-10月为旺季，头等舱9折，经济舱8.5折；11月到来年4月为淡季，头等舱7折，经济舱6.5折
     */
    public static void main(String[] args) {
        double Price = Price(1000, 11, "头等舱");
        System.out.println("优惠价是：" + Price);
    }

    public static double Price(double price, int month, String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    return price * 0.9;
                case "经济舱":
                    return price * 0.85;
            }
        } else {
            switch (type) {
                case "头等舱":
                    return price * 0.7;
                case "经济舱":
                    return price * 0.65;
            }
        }
        return price;
    }
}
