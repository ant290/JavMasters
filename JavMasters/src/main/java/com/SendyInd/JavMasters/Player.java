package com.SendyInd.JavMasters;

/**
 * Player
 */
public class Player
{
    private int _health;

    /**
     * This creates a blank player with a default health
     */
    public Player()
    {
        _health = 20;
    }

    /**
     * This creates a player with the allotted health
     * @param health The starting health of the player
     */
    public Player(int health)
    {
        _health = health;
    }

    /**
     * This gets the current health of the player
     * @return Health quantity
     */
    public int GetHealth()
    {
        return _health;
    }

    /**
     * This applies the allotted damage to the player
     * @param damage The damage to be taken
     */
    public void TakeDamage(int damage)
    {
        _health -= damage;
    }
}