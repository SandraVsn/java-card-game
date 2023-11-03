package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.HightCardGameEvaluator;
import com.openclassrooms.cardgame.games.LowCardGameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.view.ComandLineView;
import com.openclassrooms.cardgame.view.GameSwingView;

public class Games {
    public static void main(String[] args) {
        // GameController gc = new GameController(new Deck(), new ComandLineView(), new
        // HightCardGameEvaluator());
        GameSwingView view = new GameSwingView();
        view.createAndShowGUI();
        GameController gc = new GameController(new Deck(), view, new HightCardGameEvaluator());

        gc.run();
    }
}
