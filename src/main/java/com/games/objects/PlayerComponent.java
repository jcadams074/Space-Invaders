package com.games.objects;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class PlayerComponent extends JComponent{

    public final int PLAYER_WIDTH = 80;
    public final int PLAYER_HEIGHT = 20;

    private boolean isAlive = true; 

    private int playerXPos; 
    private int playerYPos;

    public PlayerComponent(){

        playerXPos = 610;
        playerYPos = 900;

    }

    public void fireCannon(){

    }

    public void explode(){
        this.isAlive = false; 
    }

    public void moveLeft(){
        playerXPos -= 12;
        System.out.println(playerXPos);
    }

    public void moveRight(){
        playerXPos += 12;
        System.out.println(playerXPos);
    }

    public boolean isAlive(){
        return isAlive;
    }

    public int getXPosition(){
        return playerXPos; 
    }

    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(playerXPos, playerYPos, PLAYER_WIDTH, PLAYER_HEIGHT);
    }
}
