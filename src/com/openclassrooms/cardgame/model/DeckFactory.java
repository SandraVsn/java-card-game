package com.openclassrooms.cardgame.model;

public class DeckFactory {
    public enum DeckType {
        Normal,
        Small,
        Test
    }

    public static Deck makeDeck(DeckType type) {
        switch (type) {
            case Small:
                return new SmallDeck();
            case Test:
                return new TestDeck();
            case Normal:
            default:
                return new NormalDeck();
        }
    }
}
