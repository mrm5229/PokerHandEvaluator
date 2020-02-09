package org.mankow.poker;

public class Card {
    private SuitTypes suit;
    private PipNum value;

    public Card() {
    }

    public Card(PipNum value, SuitTypes suit) {
        this.suit = suit;
        this.value = value;
    }

    public SuitTypes getSuit() {
        return suit;
    }

    public PipNum getValue() {
        return value;
    }
}
