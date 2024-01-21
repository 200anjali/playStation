package com.gaming.console;

import org.springframework.stereotype.Component;

@Component("mario")
public class Mario implements  Game{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Crouch");
    }

    @Override
    public void right() {

    }

    @Override
    public void left() {

    }
}
