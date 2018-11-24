package com.SendyInd.JavMasters;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.layout.*;
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
        //set up the BorderPane object to contain the UI
        BorderPane pageContainter = new BorderPane();

        //set up the FlowPane to contain the main contents
        FlowPane contentContainer = new FlowPane();
        pageContainter.setCenter(contentContainer);

        // set up menu items using fxml
        HBox menuBar;
        try {
            menuBar = FXMLLoader.load(getClass().getResource("MenuBar.fxml"));
        } catch (IOException e) {
            // TODO Auto-generated catch block tidy up logging
            menuBar = new HBox();
			e.printStackTrace();
		}
        menuBar.setSpacing(10);
        pageContainter.setTop(menuBar);
        
        //set up footer items
        HBox footerBar;
        try {
            footerBar = FXMLLoader.load(getClass().getResource("FooterBar.fxml"));
        } catch (IOException e) {
            // TODO Auto-generated catch block tidy up logging
            footerBar = new HBox();
			e.printStackTrace();
		}
        footerBar.setSpacing(10);
        pageContainter.setBottom(footerBar);
        
        //spin up the scene and apply components
        Scene scene = new Scene(pageContainter,300,400) ;
        stage.setTitle("JavMasters");
        stage.setScene(scene);
        stage.show();
    }
}
