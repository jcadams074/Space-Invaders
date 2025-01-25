package com.games.interfaces;

// Common functionality among all enemy types
public interface Enemy {
    int getPointValue();
    boolean getIsAlive();
    void fireLaser(); 
    void explode();
}
