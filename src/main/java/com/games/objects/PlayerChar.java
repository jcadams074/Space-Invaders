package com.games.objects;

public class PlayerChar {

    private boolean isAlive = true; 

    private float xPos; 

    // Add path to sprite file

    public void fireCannon(){

    }

    public void explode(){
        this.isAlive = false; 
    }

    public void moveLeft(){
        setXPosition(xPos += 0.2);
    }

    public void moveRight(){
        setXPosition(xPos -= 0.2);
    }

    public boolean getIsAlive(){
        return isAlive;
    }

    // Update the X Position
    private void setXPosition(float xPos){
        this.xPos = xPos;
    }
}
