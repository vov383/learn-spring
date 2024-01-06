package com.in28minites.learnspringframework.game;

import com.in28minites.learnspringframework.GamingConsole;

public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Shoot a bullet");
    }

}
