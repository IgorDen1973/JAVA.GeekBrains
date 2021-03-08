package ru.geekbrains.JAVA2.outStanding.model;

import ru.geekbrains.JAVA2.outStanding.model.entity.Weather;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface IWeatherProvider {
    Weather getCurrentWeather(String cityKey) throws IOException, ParseException;

//    void getWeatherForFiveDays(String cityKey) throws IOException, ParseException;  CHANGE!!!
    List<Weather> getWeatherForFiveDays(String cityKey) throws IOException, ParseException;

}


