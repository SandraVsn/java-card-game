package com.openclassrooms.cardgame.games;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.view.View;
import com.openclassrooms.cardgame.model.Deck;

public class Games {
    public static void main(String[] args) {
        GameController gc = new GameController(new Deck(), new View());
        gc.run();
    }
}