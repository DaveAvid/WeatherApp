package com.orange.models;

public class ImageManager {

    public static String getImage(String icon) {
        switch (icon) {
            case "01d":
                return "/images/day1.png";
            case "01n":
                return "/images/day1.png";
            case "02d":
                return "/images/day2.png";
            case "02n":
                return "/images/day2.png";
            case "03d":
            case "03n":
                return "/images/cloudy.png";
            case "04d":
            case "04n":
                return "/images/cloudy.png";
            case "09d":
            case "09n":
                return "/images/cloudyRain.png";
            case "10d":
                return "/images/partlySunnyRain.png";
            case "10n":
                return "/images/cloudyRain.png";
            case "11n":
            case "11d":
                return "/images/thunderStorms.png";
            case "13d":
            case "13n":
                return "/images/snow.png";
            case "50d":
            case "50n":
                return "/images/windy.png";
        }
        return "images/day1.jpg";
    }

}
