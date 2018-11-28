package com.SendyInd.JavMasters;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
/**
 * UIContainer
 * Used to house the UI building blocks.
 */
public class UIContainer{
    Scene scene;
    FlowPane contentContainer;

    @FXML Button startButton;
    @FXML Label menuLabel;

    /**
     * Constructor, builds the UI blocks
     */
    public UIContainer(){
        buildContent();
    }

    private void buildContent(){
        //set up the BorderPane object to contain the UI
        BorderPane pageContainter = new BorderPane();

        //set up the FlowPane to contain the main contents
        contentContainer = new FlowPane();
        pageContainter.setCenter(contentContainer);

        // set up menu items using fxml
        HBox menuBar;
        try {
            menuBar = FXMLLoader.load(getClass().getResource("MenuBar.fxml"));
            
            //startButton.setOnAction(new EventHandler<ActionEvent>() {
            //    @Override public void handle(ActionEvent e) {
            //        menuLabel.setText("Accepted");
            //    }
            //});
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
        scene = new Scene(pageContainter,300,400) ;
    }

    /**
     * Sends back the scene that has been created
     * @return JavaFX.Scene
     */
    public Scene getContent(){
        return scene;
    }

    /**
     * Adds the handed in node to the central content
     * @param node
     */
    public void addContent(Node node){
        contentContainer.getChildren().add(node);
    }
}