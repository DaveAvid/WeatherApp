package com.orange.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class controller implements Initializable {

    @FXML
    private Label lblOut;

    @FXML
    private void btnClickAction(ActionEvent event) {
        lblOut.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleButtonClicks(ActionEvent actionEvent) {
    }
}