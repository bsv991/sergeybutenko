package ua.hillel.poker;

public class DeckIsNotCreatedException extends RuntimeException{
    DeckIsNotCreatedException (String massage) {
        super(massage);
    }
}
