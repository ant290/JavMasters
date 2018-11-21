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

    /**
     * This runs the game iterations
     * @param none
     * @return void
     */
    public void startGame()
    {
        while(_player.GetHealth() > 0)
        {
            takeTurn();
        }

        endGame();

    }

    /**
     * This is used to go through a turn
     * @param none
     * @return void
     */
    public void takeTurn()
    {
        _turnCounter.incrementTurn();

        int roll = _dice.Roll();
        System.out.println("rolled: " + roll);
        _player.TakeDamage(roll);
    }

    /**
     * This is used to wrap up the game state
     * @param none
     * @return void
     */
    public void endGame() 
    {
        int turn = _turnCounter.getTurn();
        int health = _player.GetHealth();
        System.out.println("game took " + turn + " turns to reduce player to " + health + " health");    
    }
}