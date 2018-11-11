package com.SendyInd.JavMasters;

/**
 * Dice
 */
public class Dice {
    private int _sides;
    private String _name;

    public Dice()
    {
        _name = "New Dice";
        _sides = 6;
    }

    public Dice(String name, int sides)
    {
        _name = name;
        _sides = sides;
    }

    public String GetName()
    {
        return _name;
    }

    public int GetSides()
    {
        return _sides;
    }
}