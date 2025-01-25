package com.games.util;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameWindow {

    JFrame window = new JFrame("Space Invaders"); 

    public GameWindow(){
        window.setBounds(650, 200, 1300, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.getContentPane().setBackground(Color.BLACK);

        // For now everything will go in constructor, eventually gameplay elements won't be loaded until the game is actually started
        ImageIcon playerIcon = new ImageIcon(getClass().getResource("/temporary_player.png")); 
        JLabel playerLabel = new JLabel(playerIcon); 

        

        window.add(playerLabel); 

        // Must be the last method called when creating the window. If this is called prior to adding any elements, they wont appear bc the frame will have already been rendered prior that code's execution.
        window.setVisible(true);
    }

    public boolean getVisibility(){
        return window.isVisible();
    }
}
