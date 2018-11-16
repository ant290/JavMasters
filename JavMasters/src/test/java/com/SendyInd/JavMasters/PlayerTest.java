package com.SendyInd.JavMasters;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * PlayerTest
 */
public class PlayerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PlayerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PlayerTest.class );
    }

    public void test_Default_Health() {
        final Player player = new Player();
        assertEquals(20, player.GetHealth());
    }

    public void test_Given_Health() {
        final Player player = new Player(15);
        assertEquals(15, player.GetHealth());
    }
    
    public void test_TakeDamage() {
        final Player player = new Player();
        player.TakeDamage(5);
        assertEquals(15, player.GetHealth());
    }
}