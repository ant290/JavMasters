package com.SendyInd.JavMasters;

/**
 * GameContainer
 * Used to maintain the game state
 */
public class GameContainer {

    private Player _player;
    private TurnCounter _turnCounter;
    private Dice _dice;
    private UIContainer _uIContainer;
    private UIWriter _uIWriter;

    /**
     * Constructor taking in a UIContainer, this allows for UI controls to be handled
     * @param uiContainer
     */
    public GameContainer(UIContainer uiContainer)
    {
        //set up all the components
        _player = new Player();
        _turnCounter = new TurnCounter();
        _dice = new Dice();
        _uIContainer = uiContainer;
        _uIWriter = new UIWriter(_uIContainer);
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
        _uIWriter.WriteLine("rolled: " + roll);
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
        _uIWriter.WriteLine("game took " + turn + " turns to reduce player to " + health + " health");    
    }
}