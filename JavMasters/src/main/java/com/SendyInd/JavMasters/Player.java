package com.SendyInd.JavMasters;

public class Player
{
    private int _health;

    public Player()
    {
        _health = 20;
    }

    public Player(int health)
    {
        _health = health;
    }

    public int GetHealth()
    {
        return _health;
    }

    public void TakeDamage(int damage)
    {
        _health -= damage;
    }
}