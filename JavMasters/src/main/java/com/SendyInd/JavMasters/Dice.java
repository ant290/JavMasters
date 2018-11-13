package com.SendyInd.JavMasters;
import java.util.Random;
/**
 * Dice
 */
public class Dice {
    private int _sides;
    private String _name;

    public Dice()
    {
        _name = "D6";
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

    public int Roll()
    {
        Random r = new Random();
        return r.nextInt(_sides)+1;
    }

    public int Roll(int times)
    {
        int total = 0;
        Random r = new Random();
        for(int i = 0; i < times; i++)
        {
            total += r.nextInt(_sides)+1;
        }

        return total;
    }
}