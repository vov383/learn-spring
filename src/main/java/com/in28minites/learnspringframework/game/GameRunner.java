package com.in28minites.learnspringframework.game;

import com.in28minites.learnspringframework.GamingConsole;

public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game is : " + game);
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
