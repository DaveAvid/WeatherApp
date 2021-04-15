package com.orange;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @SuppressWarnings("restriction")
    @Override
    public void start(Stage primaryStage) throws LoadException {

        try {
            Parent root = FXMLLoader.load(MainApplication.class.getResource("/fxml/primary.fxml"));

            primaryStage.setTitle("Weather");

            primaryStage.getIcons().add(new Image("/images/icon.png"));
            primaryStage.setScene(new Scene(root, 1050, 970));
            primaryStage.getScene().getStylesheets().addAll(MainApplication.class.getResource("/styles/style.css").toExternalForm());
            primaryStage.show();
            primaryStage.setResizable(false);
            primaryStage.sizeToScene();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("restriction")
    public static void main(String[] args) throws LoadException {
        launch(args);
    }
}




