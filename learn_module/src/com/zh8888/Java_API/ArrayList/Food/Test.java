package com.zh8888.Java_API.ArrayList.Food;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Food> foodList = new ArrayList<>();
        FoodOperator foodOperator = new FoodOperator(foodList);
        foodOperator.start();
    }
}
