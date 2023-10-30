package com.openclassroom.cardgame.model;

import java.util.ArrayList;
import java.util.List;

import com.openclassrooms.cardgame.model.PlayingCard;

public class Hand {
    private List<PlayingCard> cards;

    // Constructor
    public Hand() {
        cards = new ArrayList<PlayingCard>();
    }

    public void addCard(PlayingCard pc) {
        cards.add(pc);
    }

    public PlayingCard getCard(int index) {
        return cards.get(index);
    }

    public PlayingCard removeCard() {
        return cards.remove(0);
    }

}
