package com.openclassrooms.cardgame.model;

import com.openclassrooms.cardgame.model.Rank;
import com.openclassrooms.cardgame.model.Suit;

public class PlayingCard {
    private Rank rank;
    private Suit suit;
    private boolean faceUp;

    // Constructor
    public PlayingCard(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public boolean flip() {
        faceUp = !faceUp;
        return faceUp;
    }
}
