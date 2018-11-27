package com.SendyInd.JavMasters;

import javafx.scene.control.Label;

/**
 * UIWriter
 * Used to write results out to the UI
 */
public class UIWriter implements IWriter{

    private UIContainer _uiContainer;
    private Label _textOutput;

    /**
     * construct the UIWriter with the given UIContainer class
     * @param _UiContainer
     */
    public UIWriter(UIContainer uIContainer){
        _uiContainer = uIContainer;

        _textOutput = new Label();
        _textOutput.setWrapText(true);
        //textOutput.setStyle("");
        _uiContainer.addContent(_textOutput);
    }

    public void WriteLine(String words){
        var combinedText = _textOutput.getText() + words + "\n";
        _textOutput.setText(combinedText);
    }
}