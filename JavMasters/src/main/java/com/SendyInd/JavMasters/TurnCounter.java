package com.SendyInd.JavMasters;

/**
 * TurnCounter
 */
public class TurnCounter {
    private int _gameLength;
    private int _currentTurn;

    /**
     * Creates a default TurnCounter with 0 game length at 0 turns
     */
    public TurnCounter(){
        _gameLength = 0;
        _currentTurn = 0;
    }

    /**
     * This increases the turn count, and informs a completed game
     * @return Game completion state
     */
    public boolean incrementTurn()
    {
        _currentTurn += 1;
        if(_gameLength > 0)
        {
            return false;
        }
        else
        {
           return (_currentTurn > _gameLength) ? true : false;
        }
    }

    /**
     * This gets the current turn number
     * @return the number of the current turn
     */
    public int getTurn()
    {
        return _currentTurn;
    }
}