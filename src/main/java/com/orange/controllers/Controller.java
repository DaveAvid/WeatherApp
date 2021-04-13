package com.orange.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.orange.models.ImageManager;
import com.orange.models.WeatherService;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    WeatherService weatherService;
    String citySet;

    @FXML
    private ImageView img;
    @FXML
    private JFXButton change, set, cancel;
    @FXML
    private JFXTextField cityName, invis;
    @FXML
    private Label city, temperature, day, description, errors, windSpeed, cloudiness, pressure, humidity;


    //Constructor to set the initial city to Minneapolis
    public Controller() {
        this.citySet = "Rochester".toUpperCase();
    }

    //Event Handler for each button
    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent actionEvent) {
        String initialCity = city.getText(); //stores the last searched city-name

        if (actionEvent.getSource() == change) {
            cityName.setText("");
            bottomSet(true);
            cityName.requestFocus();
        } else if (actionEvent.getSource() == set) {
            setPressed();
        } else if (actionEvent.getSource() == cancel) {
            cityName.setText(initialCity);
            bottomSet(false);
            invis.requestFocus();
        }
    }

    //method to clear all the fields
    private void reset() {
        bottomSet(false);
        day.setText("");
        temperature.setText("");
        description.setText("");
        windSpeed.setText("");
        cloudiness.setText("");
        pressure.setText("");
        humidity.setText("");
        img.setImage(null);
    }

    //method to set the new entered city
    private void setPressed() {
        //if user enters nothing into cityName field
        if (cityName.getText().equals("")) {
            showToast("City Name cannot be blank");
            return;
        } else {
            try {
                errors.setText("");
                this.citySet = cityName.getText().trim().toUpperCase();
                weatherService.setCity(this.citySet);
                cityName.setText((this.citySet.toUpperCase()));
                weatherService.getWeatherConnection();
                showWeather();
                bottomSet(false);
                invis.requestFocus();
            } catch (Exception e) {
                city.setText("Error!!");
                city.setTextFill(Color.TOMATO);
                showToast("City with the given name was not found.");
                reset();
                invis.requestFocus();
            }
        }
    }

    //method to handle nodes at botton part of the scene
    private void bottomSet(boolean statement) {
        cityName.setDisable(!statement);
        set.setVisible(statement);
        change.setVisible(!statement);
        cancel.setVisible(statement);
    }

    //method to show error messages
    private void showToast(String message) {
        errors.setText(message);
        errors.setTextFill(Color.TOMATO);
        errors.setStyle("-fx-background-color: #fff; -fx-background-radius: 50px;");

        FadeTransition fadeIn = new FadeTransition(Duration.seconds(1), errors);
        fadeIn.setToValue(1);
        fadeIn.setFromValue(0);
        fadeIn.play();

        fadeIn.setOnFinished(event -> {
            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.play();
            pause.setOnFinished(event2 -> {
                FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), errors);
                fadeOut.setToValue(0);
                fadeOut.setFromValue(1);
                fadeOut.play();
            });
        });
    }

    //    //actual method to call and get the weather and populate the scene
    private void showWeather() throws IOException {
        weatherService.getWeatherConnection();
        city.setText(weatherService.getCity().toUpperCase());
        temperature.setText(weatherService.getTemperature() + "°F");
        day.setText(weatherService.getDay().toUpperCase());
        description.setText(weatherService.getDescription().toUpperCase());
        img.setImage(new Image(ImageManager.getImage(weatherService.getIcon())));
        windSpeed.setText(weatherService.getWindSpeed() + " m/s");
        cloudiness.setText(weatherService.getCloudiness() + "%");
        pressure.setText(weatherService.getPressure() + " hpa");
        humidity.setText(weatherService.getHumidity() + "%");
    }

    public void initialize(URL location, ResourceBundle resources) {
        cityName.setText(citySet);
        cityName.setDisable(true);
        set.setVisible(false);
        cancel.setVisible(false);
        errors.setText("");
        weatherService = new WeatherService(citySet);
        invis.requestFocus();

        //try catch block to see if there is internet and disabling every field
        try {
            showWeather();
        } catch (Exception e) {
            city.setText("Error!! - No Internet");
            city.setTextFill(Color.TOMATO);
            showToast("Internet Down. Please Connect");
            reset();
            change.setDisable(true);
            cityName.setText("");
        }

        //Set the city entered into textField on pressing enter on Keyboard
        cityName.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                setPressed();
            }
        });
    }
}