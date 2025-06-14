package com.zh8888.Java.Array;

public class ArrayTest3 {
    public static void main(String[] args) {
        //数组元素求最大值
        int[] faceScores = {15, 9000, 10000, 20000, -5};

        int maxScore = faceScores[0];

        for (int i = 1; i < faceScores.length; i++) { //从第二个元素开始遍历
            if (faceScores[i] > maxScore){
                maxScore = faceScores[i];
            }
        }
        System.out.println("最大值是：" + maxScore);
    }
}





