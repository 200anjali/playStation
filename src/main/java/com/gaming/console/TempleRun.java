package com.gaming.console;
import com.gaming.console.Game;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("templeRun")
@Primary
public class TempleRun implements Game {

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
        System.out.println("Move Right");
    }

    @Override
    public void left() {
        System.out.println("Move Left");
    }
}
