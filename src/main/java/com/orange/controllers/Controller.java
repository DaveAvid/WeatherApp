package com.orange.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.orange.models.ForecastService;
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
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {
    ForecastService forecastService;
    WeatherService weatherService;
    String citySet;

    @FXML
    private ImageView img, forecastImg, forecastImg2, forecastImg3, forecastImg4, forecastImg5;
    @FXML
    private JFXButton change, set, cancel, preset1, preset2, preset3, setPreset1, setPreset2, setPreset3;
    @FXML
    private JFXTextField cityName, invis;
    @FXML
    private Label city, temperature, day, description, errors, windSpeed, cloudiness, pressure, humidity;
    @FXML
    private Label forecastDay, forecastTemperature, forecastDescription, forecastDay2, forecastTemperature2, forecastDescription2,
            forecastDay3, forecastTemperature3, forecastDescription3, forecastDay4, forecastTemperature4, forecastDescription4,
            forecastDay5, forecastTemperature5, forecastDescription5;


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
        } else if (actionEvent.getSource() == setPreset1) {
            setLocation(setPreset1);
        } else if (actionEvent.getSource() == setPreset2) {
            setLocation(setPreset2);
        } else if (actionEvent.getSource() == setPreset3) {
            setLocation(setPreset3);
        } else if (actionEvent.getSource() == preset1) {
            locationGrab(preset1.getText());
        } else if (actionEvent.getSource() == preset2) {
            locationGrab(preset2.getText());
        } else if (actionEvent.getSource() == preset3) {
            locationGrab(preset3.getText());
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

    //method to clear all the fields
    private void resetForecast() {
        bottomSet(false);
        forecastDay.setText("");
        forecastTemperature.setText("");
        forecastDescription.setText("");
        forecastImg.setImage(null);
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
                forecastService.setCity(this.citySet);
                cityName.setText((this.citySet.toUpperCase()));
                weatherService.getWeatherConnection();
                forecastService.getForecastConnection();
                showWeather();
                showForecast();
                bottomSet(false);
                invis.requestFocus();
            } catch (Exception e) {
                city.setText("Error!!");
                city.setTextFill(Color.TOMATO);
                showToast("City with the given name was not found.");
                reset();
                resetForecast();
                invis.requestFocus();
            }
        }
    }

    private void locationGrab(String city) {
        weatherService.setCity(city);
        forecastService.setCity(city);
        showWeather();
        showForecast();
    }

    private void setLocation(JFXButton pressed) {
        //if user enters nothing into cityName field
        if (cityName.getText().equals("")) {
            showToast("City Name cannot be blank");
            return;
        } else {
            try {
                errors.setText("");
                this.citySet = cityName.getText().trim().toUpperCase();
                weatherService.setCity(this.citySet);
                forecastService.setCity(this.citySet);
                cityName.setText((this.citySet.toUpperCase()));
                weatherService.getWeatherConnection();
                forecastService.getForecastConnection();
                if(pressed == setPreset1) {
                    preset1.setText(citySet);
                    weatherService.writeJsonLocation(weatherService.getJsonString(), "1");
                } else if (pressed == setPreset2) {
                    preset2.setText(citySet);
                    weatherService.writeJsonLocation(weatherService.getJsonString(), "2");
                } else if (pressed == setPreset3) {
                    preset3.setText(citySet);
                    weatherService.writeJsonLocation(weatherService.getJsonString(), "3");
                }
                bottomSet(false);
                invis.requestFocus();
            } catch (Exception e) {
                city.setText("Error!!");
                city.setTextFill(Color.TOMATO);
                showToast("City with the given name was not found.");
                reset();
                resetForecast();
                invis.requestFocus();
            }
        }
        if(pressed == setPreset1) {
            preset1.setText(citySet);
        } else if (pressed == setPreset2) {
            preset2.setText(citySet);
        } else if (pressed == setPreset3) {
            preset3.setText(citySet);
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

    //actual method to call and get the weather and populate the scene
    private void showWeather() {
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

    public void showForecast() {
        forecastService.getForecastConnection();
        forecastTemperature.setText(forecastService.getTemperature() + "°F");
        forecastDay.setText(forecastService.getSpecificDay());
        forecastDescription.setText(forecastService.getDescription().toUpperCase());
        forecastImg.setImage(new Image(ImageManager.getImage(forecastService.getIcon())));

        forecastTemperature2.setText(forecastService.getTemperature2() + "°F");
        forecastDay2.setText(forecastService.getSpecificDay2());
        forecastDescription2.setText(forecastService.getDescription2().toUpperCase());
        forecastImg2.setImage(new Image(ImageManager.getImage(forecastService.getIcon2())));

        forecastTemperature3.setText(forecastService.getTemperature3() + "°F");
        forecastDay3.setText(forecastService.getSpecificDay3());
        forecastDescription3.setText(forecastService.getDescription3().toUpperCase());
        forecastImg3.setImage(new Image(ImageManager.getImage(forecastService.getIcon3())));

        forecastTemperature4.setText(forecastService.getTemperature4() + "°F");
        forecastDay4.setText(forecastService.getSpecificDay4());
        forecastDescription4.setText(forecastService.getDescription4().toUpperCase());
        forecastImg4.setImage(new Image(ImageManager.getImage(forecastService.getIcon4())));

        forecastTemperature5.setText(forecastService.getTemperature5() + "°F");
        forecastDay5.setText(forecastService.getSpecificDay5());
        forecastDescription5.setText(forecastService.getDescription5().toUpperCase());
        forecastImg5.setImage(new Image(ImageManager.getImage(forecastService.getIcon5())));

    }

    public String readJsonLocation(String jsonString) {
        String temp = null;
        try {
            File myObj = new File(jsonString);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                temp = StringUtils.remove(data, "{");
                temp = StringUtils.remove(temp, "}");
                String[] strArray = temp.split(",");
                for (int i = 0; i < strArray.length; i++) {
                    if(strArray[i].contains("name")) {
                        temp = strArray[i];
                    }
                }
                temp = StringUtils.remove(temp, "\"");
                temp = StringUtils.remove(temp, "name:");
                System.out.println(temp);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return temp;
    }

    public void initialize(URL location, ResourceBundle resources) {
        String temp1 = readJsonLocation("jsonLocation1.txt");
        preset1.setText(temp1);
        String temp2 = readJsonLocation("jsonLocation2.txt");
        preset2.setText(temp2);
        String temp3 = readJsonLocation("jsonLocation3.txt");
        preset3.setText(temp3);

        citySet = temp1;
        cityName.setText(citySet);
        cityName.setDisable(true);
        set.setVisible(false);
        cancel.setVisible(false);
        errors.setText("");
        weatherService = new WeatherService(citySet);
        forecastService = new ForecastService(citySet);
        invis.requestFocus();

        //try catch block to see if there is internet and disabling every field
        try {
            showWeather();
            showForecast();
        } catch (Exception e) {
            city.setText("Error!! - No Internet");
            city.setTextFill(Color.TOMATO);
            showToast("Internet Down. Please Connect");
            reset();
            resetForecast();
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