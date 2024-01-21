package com.gaming.console;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    public void run(Game selectedGame) {
        selectedGame.up();
        selectedGame.down();
        selectedGame.left();
        selectedGame.right();
    }
}
