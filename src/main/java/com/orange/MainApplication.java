package com.orange;


import com.orange.services.WeatherService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        WeatherService weatherService = new WeatherService();
        weatherService.weatherConnection("Minneapolis");
        try{
            Parent root = FXMLLoader.load(MainApplication.class.getResource("/fxml/primary.fxml"));

            primaryStage.setTitle("Weather");

//            primaryStage.getIcons().add(new Image("/images/icon.png"));
            primaryStage.setScene(new Scene(root, 1050, 670));
            primaryStage.getScene().getStylesheets().addAll(MainApplication.class.getResource("/styles/style.css").toExternalForm());
            primaryStage.show();
            primaryStage.setResizable(false);
            primaryStage.sizeToScene();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}




