package com.games.objects.enemies;

import com.games.interfaces.Enemy;

public class Crab implements Enemy {

    static final int pointValue = 20; 
    boolean isAlive = true; 

    // Add path to sprite
    
    @Override
    public void fireLaser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fireLaser'");
    }

    @Override
    public void explode() {
        this.isAlive = false;
        // explosion animation
    }


    @Override
    public int getPointValue() {
        return pointValue; 
    }

    @Override
    public boolean getIsAlive() {
        return isAlive; 
    }
    
}
