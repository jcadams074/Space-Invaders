package com.games.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;

import com.games.objects.PlayerComponent;

public class GameManager extends JComponent implements KeyListener{ 

    PlayerComponent player;
    GameWindow window; 

    public GameManager(){
        player = new PlayerComponent();
        window = new GameWindow(player);

        window.addKeyListener(this);
        window.setFocusable(true);
        window.requestFocus();

        try {
            run();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void run() throws Exception{
        while(window.getVisibility() == true){
            Thread.sleep(250);
            window.repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
            // Preventing player from moving off screen to right
                if((window.getWidth() - player.getXPosition()) > 120){
                    player.moveRight();
                }
                break;
            case KeyEvent.VK_LEFT:  
            // Preventing player from moving off screen to left
                if((window.getWidth() - player.getXPosition()) < 1280){
                    player.moveLeft();
                }
                break;
            default:
                break;
        }
        window.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
}   
