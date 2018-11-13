package com.SendyInd.JavMasters;

/**
 * TurnCounter
 */
public class TurnCounter {
    private int _gameLength;
    private int _currentTurn;

    public TurnCounter(){
        _gameLength = 0;
        _currentTurn = 0;
    }

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

    public int getTurn()
    {
        return _currentTurn;
    }
}