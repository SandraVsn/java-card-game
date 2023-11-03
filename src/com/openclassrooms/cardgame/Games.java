package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.HightCardGameEvaluator;
import com.openclassrooms.cardgame.games.LowCardGameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.view.ComandLineView;

public class Games {
    public static void main(String[] args) {
        // GameController gc = new GameController(new Deck(), new ComandLineView(), new
        // HightCardGameEvaluator());
        GameController gc = new GameController(new Deck(), new ComandLineView(), new LowCardGameEvaluator());

        gc.run();
    }
}
