package com.SendyInd.JavMasters;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * UIContainerTest
 */
public class UIContainerTest
    extends TestCase 
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public UIContainerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( UIContainerTest.class );
    }

    public void test_Created_UI_exists() {
        // TODO find testing framework for JavaFX 
        //final UIContainer uiContainer = new UIContainer();
        assertNotNull(1);
    }
    
}