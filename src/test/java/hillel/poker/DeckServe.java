package hillel.poker;

import static hillel.logger.Logger.RESET;

public class DeckServe {
    private static final int noOfPlayers = 4;
    private static final String[] deck = DeckShuffle.shuffleDeck();

    public static void serveDeck() {
        int count = 0;
        for (int round = 1; round < 6; round++) {
            System.out.println(RESET + "Round " + round);
            for (int player = 1; player < noOfPlayers + 1; player++) {
                String card = deck[count++];
                System.out.printf(RESET + "Player %d gets card %s%n", player, card);
            }
            System.out.println("\n");
        }
    }
}