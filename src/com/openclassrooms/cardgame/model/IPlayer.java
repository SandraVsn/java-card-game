package com.openclassrooms.cardgame.model;

import com.openclassroom.cardgame.model.Hand;
import com.openclassroom.cardgame.model.PlayingCard;

public interface IPlayer {
    public void addCardToHand(PlayingCard pc);

    public PlayingCard getCard(int index);

    public PlayingCard removeCard();

    public String getName();
}
