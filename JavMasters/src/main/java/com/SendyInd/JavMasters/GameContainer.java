package com.SendyInd.JavMasters;

import java.util.Scanner;

/**
 * GameContainer
 */
public class GameContainer {

    private Player _player;
    private TurnCounter _turnCounter;
    private Dice _dice;

    public GameContainer()
    {

        //set up all the components
        _player = new Player();
        _turnCounter = new TurnCounter();
        _dice = new Dice();
    }

    public void startGame()
    {
        System.out.print("Enter starting health: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        
        _player.SetHealth(Integer.parseInt(input));
        System.out.println();

        System.out.println("Player's starting health is: " + _player.GetHealth() + "\n");

        while(_player.GetHealth() > 0)
        {
            //take turn
            _turnCounter.incrementTurn();

            int roll = _dice.Roll();
            _player.TakeDamage(roll);
            System.out.println("rolled: " + roll + "; health now: " + _player.GetHealth());
        }

        int turn = _turnCounter.getTurn();
        int health = _player.GetHealth();
        System.out.println("\n" + "game took " + turn + " turns to reduce player to " + health + " health" + "\n");

    }
}