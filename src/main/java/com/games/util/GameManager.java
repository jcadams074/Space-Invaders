package com.games.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.games.objects.PlayerComponent;

public class GameManager implements KeyListener{ 

    PlayerComponent component; 

    public GameManager(PlayerComponent component){
        this.component = component;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar(); 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            component.moveRight();
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            component.moveLeft();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
