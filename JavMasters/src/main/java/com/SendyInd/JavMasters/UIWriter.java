package com.SendyInd.JavMasters;

import javafx.scene.control.Label;

/**
 * UIWriter
 * Used to write results out to the UI
 */
public class UIWriter {

    UIContainer uiContainer;
    Label textOutput;

    /**
     * construct the UIWriter with the given UIContainer class
     * @param _UiContainer
     */
    public UIWriter(UIContainer _UiContainer){
        uiContainer = _UiContainer;

        textOutput = new Label();
        textOutput.setWrapText(true);
        //textOutput.setStyle("");
        uiContainer.addContent(textOutput);
    }

    public void WriteLine(String words){
        var combinedText = textOutput.getText() + words + "\n";
        textOutput.setText(combinedText);
    }
}