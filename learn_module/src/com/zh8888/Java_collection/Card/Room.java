package com.zh8888.Java_collection.Card;

import java.util.*;

public class Room {
    List<Card> cards = new ArrayList<>();
    List<Card> player1 = new ArrayList<>();
    List<Card> player2 = new ArrayList<>();
    List<Card> player3 = new ArrayList<>();

    String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    String[] colors = {"♥", "♠", "♣", "♦"};

    public Room() {
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card card = new Card(number, color, size);
                cards.add(card);
            }
        }
        cards.add(new Card("Joker", "Black", ++size));
        cards.add(new Card("Joker", "Red", ++size));
    }

    public void start() {
        System.out.println("欢迎来到斗地主游戏！");
        System.out.println("现在开始拿新牌！");
        System.out.println(cards);
        System.out.println("现在开始打乱！");
        Collections.shuffle(cards);
        System.out.println("打乱后的牌：");
        System.out.println(cards);
        System.out.println("开始发牌！");
        fa(); // 发牌
        sortAll(); // 排序
        List<Card> lastCards = cards.subList(cards.size() - 3, cards.size());
        System.out.println("玩家1的牌：" + player1);
        System.out.println("玩家2的牌：" + player2);
        System.out.println("玩家3的牌：" + player3);
        System.out.println("底牌：" + lastCards);
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择地主：1.player1 2.player2 3.player3");
        String choice = sc.nextLine();
        switch (choice) {
            case "1" -> {
                player1.addAll(lastCards);
                sortOne(player1);
                System.out.println("玩家1是地主！他的牌是：" + player1);
            }
            case "2" -> {
                player2.addAll(lastCards);
                sortOne(player2);
                System.out.println("玩家2是地主！他的牌是：" + player2);
            }
            case "3" -> {
                player3.addAll(lastCards);
                sortOne(player3);
                System.out.println("玩家3是地主！他的牌是：" + player3);
            }
            default -> System.out.println("输入错误！");
        }
    }

    private void fa() {
        for (int i = 0; i < cards.size() - 3; i++) {
            if (i % 3 == 0) {
                player1.add(cards.get(i));
            } else if (i % 3 == 1) {
                player2.add(cards.get(i));
            } else {
                player3.add(cards.get(i));
            }
        }
    }
    private void sortAll() {
        sortOne(player1);
        sortOne(player2);
        sortOne(player3);
    }
    private void sortOne(List<Card> cards) {
        cards.sort((o1, o2) -> o1.getSize() - o2.getSize());
    }

}