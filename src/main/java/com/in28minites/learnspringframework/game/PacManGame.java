package com.in28minites.learnspringframework.game;

import com.in28minites.learnspringframework.GamingConsole;

public class PacManGame implements GamingConsole {

    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }
}
