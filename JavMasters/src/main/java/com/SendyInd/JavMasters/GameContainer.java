package com.SendyInd.JavMasters;

/**
 * GameContainer
 */
public class GameContainer {

    private Player _player;
    private TurnCounter _turnCounter;
    private Dice _dice;

    public GameContainer()
    {
        //set up all the components
        _player = new Player();
        _turnCounter = new TurnCounter();
        _dice = new Dice();
    }

    public void startGame()
    {
        System.out.println("Player's starting health is: " + _player.GetHealth());
        while(_player.GetHealth() > 0)
        {
            //take turn
            _turnCounter.incrementTurn();

            int roll = _dice.Roll();
            System.out.println("rolled: " + roll);
            _player.TakeDamage(roll);
        }

        int turn = _turnCounter.getTurn();
        int health = _player.GetHealth();
        System.out.println("game took " + turn + " turns to reduce player to " + health + " health");

    }
}