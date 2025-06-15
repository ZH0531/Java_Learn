package com.zh8888.Java_collection.Card;

import java.util.Objects;

public class Card {
    private String number;
    private String color;
    private int size;

    public Card() {
    }

    public Card(String number, String color, int size) {
        this.number = number;
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return size == card.size && Objects.equals(number, card.number) && Objects.equals(color, card.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, color, size);
    }

    @Override
    public String toString() {
        return number + color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
