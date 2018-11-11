package com.SendyInd.JavMasters;
import com.SendyInd.JavMasters.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //set up new player
        Player _player = new Player(10);
        System.out.println(_player.GetHealth());
    }
}
