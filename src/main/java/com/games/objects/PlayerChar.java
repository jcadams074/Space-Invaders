package com.games.objects;

public class PlayerChar {

    private boolean isAlive = true; 

    private float yPos; 
    private float xPos; 

    // Add path to sprite file

    public void fireCannon(){

    }

    public void explode(){
        this.isAlive = false; 
    }

    public void moveLeft(){

    }

    public void moveRight(){

    }

    public boolean isAlive(){
        return isAlive;
    }

    // Upate the Y Position
    private void setYPosition(float yPos){
        this.yPos = yPos; 
    }

    // Update the X Position
    private void setXPosition(float xPos){
        this.xPos = xPos;
    }
}
