package hillel.poker;

public class DeckCreate {
    public static int noOfCards = 52;
    private static final String[] deck = new String[noOfCards];

    public static String[] createDeck() throws DeckOfCardIsWrongException {
        String[] cardSuits = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] cardValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int count = 0;
        if (noOfCards == 52) {
            for (String suite : cardSuits) {
                for (String value : cardValues) {
                    deck[count++] = String.format("%s of %s", value, suite);
                }
            }
        } else {
            throw new DeckOfCardIsWrongException("Deck of cards is wrong");
        }
        return deck;
    }
}
