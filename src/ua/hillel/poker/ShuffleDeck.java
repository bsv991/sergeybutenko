package ua.hillel.poker;

import java.util.Arrays;
import java.util.Random;

import static ua.hillel.poker.CreateDeck.noOfCards;

public class ShuffleDeck {
    private static final String[] deck = CreateDeck.createDeck();

    public static String[] shuffleDeck() throws DeckOfCardIsWrongException {
        boolean a = Arrays.asList(deck).isEmpty();
        if (!a) {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int in = random.nextInt(noOfCards);
                int out = random.nextInt(noOfCards);
                String card = deck[in];
                deck[in] = deck[out];
                deck[out] = card;
            }
        } else {
            throw new DeckIsNotCreatedException("The deck is not created");
        }
        return deck;
    }
}