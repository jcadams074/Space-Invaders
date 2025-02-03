package com.games.util;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.games.objects.PlayerComponent;



public class GameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 1300;
    private static final int WINDOW_HEIGHT = 1000;

    PlayerComponent player; 

    public GameWindow(PlayerComponent player) {

        this.player = player; 

        setTitle("Space Invaders");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Create the game panel and add it to the frame
        GamePanel panel = new GamePanel();
        add(panel);

        setVisible(true);
    }

    // Inner class for rendering
    private class GamePanel extends JPanel {
        public GamePanel() {
            setBackground(Color.BLACK);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            player.draw(g);
        }
    }

    public boolean getVisibility(){
        return this.isVisible(); 
    }
}
