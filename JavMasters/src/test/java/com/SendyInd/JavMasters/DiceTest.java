package com.SendyInd.JavMasters;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * DiceTest
 */
public class DiceTest 
    extends TestCase 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DiceTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DiceTest.class );
    }   

    public void test_Default_Dice_Name() {
        final Dice dice = new Dice();

        assertEquals("D6", dice.GetName());
    }

    public void test_Given_Dice_Name() {
        final Dice dice = new Dice("MyName",6);

        assertEquals("MyName", dice.GetName());
    }

    public void test_Default_Dice_Sides() {
        final Dice dice = new Dice();

        assertEquals(6, dice.GetSides());
    }

    public void test_Given_Dice_Sides() {
        final Dice dice = new Dice("MyName",4);

        assertEquals(4, dice.GetSides());
    }

    public void test_Roll_Returns_Up_To_Sides() {
        final Dice dice = new Dice("MyName",4);
        assertTrue(4 >= dice.Roll());
    }

    public void test_Roll_Many_Times() {
        final Dice dice = new Dice("MyName",4);
        assertTrue(dice.Roll(2) >= 2);
    }
}