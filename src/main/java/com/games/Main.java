package com.games;

import java.awt.Color;

import javax.swing.*;

// Will keep the main gameloop here
public class Main {
    public static void main(String[] args) throws Exception {

        // Creating the game window        
        JFrame window = new JFrame("Space Invaders"); 
        window.setBounds(650, 200, 1300, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setVisible(true);
        window.getContentPane().setBackground(Color.black);

        // While statement for the game loop (ends when window is closed)
        while(window.isVisible() == true){
            System.out.println("Game is running");
            Thread.sleep(500);
        }
    }
}