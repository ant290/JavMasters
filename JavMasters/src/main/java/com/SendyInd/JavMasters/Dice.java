package com.SendyInd.JavMasters;
import java.util.Random;
/**
 * Dice
 */
public class Dice {
    private int _sides;
    private String _name;

    /**
     * This creates a standard 6 sided dice called "D6"
     */
    public Dice()
    {
        _name = "D6";
        _sides = 6;
    }

    /**
     * This creates a new Dice with the given name and number of sides
     * @param name The name of the Dice
     * @param sides The number of sides
     */
    public Dice(String name, int sides)
    {
        _name = name;
        _sides = sides;
    }

    /**
     * This returns the current name of the Dice
     * @return The name of the Dice
     */
    public String GetName()
    {
        return _name;
    }

    /**
     * This returns the current number of sides the Dice has
     * @return The number of sides
     */
    public int GetSides()
    {
        return _sides;
    }

    /**
     * This generates a random number based on the number of sides
     * @return The result of the rolled Dice
     */
    public int Roll()
    {
        Random r = new Random();
        return r.nextInt(_sides)+1;
    }

    /**
     * This gives the total figure rolled after the given number of rolls
     * @param times The number of times to roll the Dice
     * @return The total sum of rolled results
     */
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