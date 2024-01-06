package com.in28minites.learnspringframework;

import com.in28minites.learnspringframework.game.GameRunner;
import com.in28minites.learnspringframework.game.PacManGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

//        var game = new SuperContraGame();
//        var game = new MarioGame();
        var game = new PacManGame();
        var gameRunner = new GameRunner(game);

        gameRunner.run();

    }
}
