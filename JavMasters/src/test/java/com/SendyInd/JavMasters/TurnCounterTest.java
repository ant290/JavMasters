package com.SendyInd.JavMasters;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * TurnCounterTest
 */
public class TurnCounterTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TurnCounterTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TurnCounterTest.class );
    }

    public void test_IncrementTurn() {
        final TurnCounter turnCounter = new TurnCounter();
        assertEquals(true, turnCounter.incrementTurn());
    }

    public void test_getTurn_Returns_Int() {
        final TurnCounter turnCounter = new TurnCounter();
        assertEquals(0, turnCounter.getTurn());
    }
}