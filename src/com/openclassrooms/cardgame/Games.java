package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.HightCardGameEvaluator;
import com.openclassrooms.cardgame.games.LowCardGameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.model.DeckFactory;
import com.openclassrooms.cardgame.model.DeckFactory.DeckType;
import com.openclassrooms.cardgame.view.ComandLineView;
import com.openclassrooms.cardgame.view.GameSwingPassiveView;
import com.openclassrooms.cardgame.view.GameSwingView;
import com.openclassrooms.cardgame.view.GameViewables;

public class Games {
    public static void main(String[] args) {

        GameViewables views = new GameViewables();

        GameSwingView gsv = new GameSwingView();
        views.addViewable(gsv);

        for (int i = 0; i < 3; i++) {
            GameSwingPassiveView passiveView = new GameSwingPassiveView();
            passiveView.createAndShowGUI();

            views.addViewable(passiveView);

            // sleep to move new Swing frame on window
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        gsv.createAndShowGUI();
        GameController gc = new GameController(DeckFactory.makeDeck(DeckType.Normal), views,
                new HightCardGameEvaluator());

        gc.run();
    }
}
