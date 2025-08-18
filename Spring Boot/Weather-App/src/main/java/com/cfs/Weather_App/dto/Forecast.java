package com.cfs.Weather_App.dto;

import java.util.ArrayList;

public class Forecast {
    public ArrayList<Forecastday> forecastDay;

    public Forecast() {}

    public Forecast(ArrayList<Forecastday> forecastDay) {
        this.forecastDay = forecastDay;
    }

    public ArrayList<Forecastday> getForecastday() {
        return forecastDay;
    }

    public void setForecastDay(ArrayList<Forecastday> forecastDay) {
        this.forecastDay = forecastDay;
    }
}
