package com.games;

import java.awt.event.KeyEvent;

import com.games.objects.PlayerComponent;
import com.games.util.GameManager;
import com.games.util.GameWindow;

// Will keep the main gameloop here
public class Main {
    public static void main(String[] args) throws Exception {

        // Creating the game window        
        PlayerComponent player = new PlayerComponent();
        GameWindow window = new GameWindow(player); 
        GameManager manager = new GameManager(player);

        // While statement for the game loop (ends when window is closed)
        while(window.getVisibility() == true){
            // manager.keyPressed(KeyEvent);
        }   
    }
}