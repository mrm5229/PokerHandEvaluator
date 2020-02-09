package org.mankow.poker.fivecard;

import org.mankow.poker.Card;

public class FiveCardHand {

    private Card[] hand = new Card[5];

    public FiveCardHand() {
    }

    public FiveCardHand(Card[] hand) {
        this.hand = hand;
    }

    public FiveCardHand(Card card1, Card card2, Card card3, Card card4, Card card5) {
        hand[0] = card1;
        hand[1] = card2;
        hand[2] = card3;
        hand[3] = card4;
        hand[4] = card5;

    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

}
