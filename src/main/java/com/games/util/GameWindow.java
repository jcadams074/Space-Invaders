package com.games.util;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.games.objects.PlayerComponent;



public class GameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 1300;
    private static final int WINDOW_HEIGHT = 1000;

    public GameWindow(PlayerComponent player) {

        setTitle("Space Invaders");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Create the game panel and draw initial player
        draw(player);
        setVisible(true);
    }

    public void draw(PlayerComponent player){
        GamePanel panel = new GamePanel(player);
        add(panel);
    }

    // Inner class for rendering
    public class GamePanel extends JPanel {
        PlayerComponent player; 

        public GamePanel(PlayerComponent player) {
            setBackground(Color.BLACK);

            this.player = player;
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

    public int getWidth(){
        return WINDOW_WIDTH;
    }

    public int getHeight(){
        return WINDOW_HEIGHT; 
    }
}
