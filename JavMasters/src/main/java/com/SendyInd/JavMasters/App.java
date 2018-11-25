package com.SendyInd.JavMasters;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavMasters
 * App
 */
public class App extends Application
{
    public static void main( String[] args )
    {
        launch();
        //GameContainer gameContainer = new GameContainer();
        //gameContainer.startGame();
    }

    @Override
    public void start(Stage stage){
        UIContainer uIContainer = new UIContainer();
        stage.setTitle("JavMasters");
        stage.setScene(uIContainer.getContent());
        stage.show();
    }
}
