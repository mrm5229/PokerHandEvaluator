package org.mankow.poker;

import org.junit.Test;
import org.mankow.poker.fivecard.FiveCardHand;
import org.mankow.poker.fivecard.FiveCardHandComparator;

import java.util.Arrays;

public class HandCompareTest {

    @Test
    public void testKingHighVsAceHigh() {
        // test setup
        // hand 1
        final Card h1card1 = new Card(PipNum.TWO, SuitTypes.CLUBS);
        final Card h1card2 = new Card(PipNum.FOUR, SuitTypes.DIAMONDS);
        final Card h1card3 = new Card(PipNum.SIX, SuitTypes.HEARTS);
        final Card h1card4 = new Card(PipNum.SEVEN, SuitTypes.SPADES);
        final Card h1card5 = new Card(PipNum.KING, SuitTypes.HEARTS); // King high

        final FiveCardHand hand1 = new FiveCardHand();
        //final Card[] hand1cards = (Card[]) Arrays.asList(h1card1, h1card2, h1card3, h1card4, h1card5).toArray();
        final Card[] hand1cards = new Card[5];
        hand1cards[0] = h1card1;
        hand1cards[1] = h1card2;
        hand1cards[2] = h1card3;
        hand1cards[3] = h1card4;
        hand1cards[4] = h1card5;

        hand1.setHand(hand1cards);

        // hand 2
        final Card h2card1 = new Card(PipNum.THREE, SuitTypes.CLUBS);
        final Card h2card2 = new Card(PipNum.FIVE, SuitTypes.DIAMONDS);
        final Card h2card3 = new Card(PipNum.SEVEN, SuitTypes.HEARTS);
        final Card h2card4 = new Card(PipNum.EIGHT, SuitTypes.SPADES);
        final Card h2card5 = new Card(PipNum.ACE, SuitTypes.HEARTS); // Ace high

        final FiveCardHand hand2 = new FiveCardHand(h2card1, h2card2, h2card3, h2card4, h2card5);

        int result = FiveCardHandComparator.compare(hand1, hand2);
        //FiveCardHandComparator comparator = new FiveCardHandComparator();
        //comparator.compare(hand1, hand2);



        // perform test

        // assert results
    }

    @Test
    public void testAceHighVsPair() {

        // test setup
        // hand 1
        final Card h1card1 = new Card(PipNum.TWO, SuitTypes.CLUBS);
        final Card h1card2 = new Card(PipNum.FOUR, SuitTypes.DIAMONDS);
        final Card h1card3 = new Card(PipNum.SIX, SuitTypes.HEARTS);
        final Card h1card4 = new Card(PipNum.SEVEN, SuitTypes.SPADES);
        final Card h1card5 = new Card(PipNum.ACE, SuitTypes.HEARTS); // Ace high

        // hand 2
        final Card h2card1 = new Card(PipNum.THREE, SuitTypes.CLUBS);
        final Card h2card2 = new Card(PipNum.FIVE, SuitTypes.DIAMONDS);
        final Card h2card3 = new Card(PipNum.SEVEN, SuitTypes.HEARTS);
        final Card h2card4 = new Card(PipNum.EIGHT, SuitTypes.SPADES); // Pair
        final Card h2card5 = new Card(PipNum.EIGHT, SuitTypes.HEARTS); // Pair
    }

    @Test
    public void testPairVsThreeOfAKind() {

        // test setup

        // perform test

        // assert results
    }
}
