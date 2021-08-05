package ua.hillel.poker;

public class DeckOfCardIsWrongException extends RuntimeException {
    DeckOfCardIsWrongException(String massage) {
        super(massage);
    }
}
