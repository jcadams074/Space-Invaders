package com.games;

import com.games.util.GameManager;
import com.games.util.GameWindow;

// Will keep the main gameloop here
public class Main {
    public static void main(String[] args) throws Exception {

        // Creating the game window        
        GameWindow window = new GameWindow(); 

        // While statement for the game loop (ends when window is closed)
        while(window.getVisibility() == true){
            GameManager.listenForInput();
        }
    }
}