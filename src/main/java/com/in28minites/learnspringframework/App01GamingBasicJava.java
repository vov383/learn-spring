package com.in28minites.learnspringframework;

import com.in28minites.learnspringframework.game.GameRunner;
import com.in28minites.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

//        var game = new SuperContraGame();
//        var game = new MarioGame();
        var game = new PacManGame(); //1: Object Creation
        var gameRunner = new GameRunner(game); //2: Object Creation + Wiring of Dependencies
        // Game is a Dependency of GameRunner

        gameRunner.run();

    }
}
