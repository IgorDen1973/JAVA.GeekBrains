package ru.geekbrains.JAVA2.outStanding.model.entity;

public class Weather {

    private String date;
    private String city;
    private String temperature;
    private String weatherText;
    private String dayTemperatureMin;  // CHANGE
    private String dayTemperatureMax;  // CHANGE
    private String dayDescriptionDay;   // CHANGE
    private String dayDescriptionNight;   // CHANGE

    public Weather(String date, String city, String temperature, String weatherText) {
        this.date = date;
        this.city = city;
        this.temperature = temperature;
        this.weatherText = weatherText;
    }
    // CHANGE
    public Weather(String date, String city,String dayTemperatureMin, String dayTemperatureMax, String dayDescriptionDay, String dayDescriptionNight) {
        this.date = date;
        this.city = city;
        this.dayTemperatureMin = dayTemperatureMin;  // CHANGE
        this.dayTemperatureMax = dayTemperatureMax;   // CHANGE
        this.dayDescriptionDay = dayDescriptionDay;   // CHANGE
        this.dayDescriptionNight = dayDescriptionNight;   // CHANGE
    }


    public Weather() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @Override
    public String toString() {   // CHANGE
        if (dayTemperatureMin == null) {
            return "\nAt " + date + " in " + city + " expected " + weatherText + " with temperature " + temperature + "C";
        } else {
            return "\nAt " + date + " in " + city + " expected temperature from " + dayTemperatureMin + " to " + dayTemperatureMax + " at day "+dayDescriptionDay+", at night "+dayDescriptionNight;
        }
    }

}
