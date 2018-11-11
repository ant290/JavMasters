package com.SendyInd.JavMasters;
/**
 * JavMasters
 * App
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //set up new player
        Player _player = new Player(10);
        System.out.println(_player.GetHealth());

        Dice _dice = new Dice();
        System.out.println(_dice.GetName());
    }
}
