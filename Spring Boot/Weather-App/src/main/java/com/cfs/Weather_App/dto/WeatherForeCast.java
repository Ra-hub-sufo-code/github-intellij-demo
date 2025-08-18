package com.cfs.Weather_App.dto;

import java.util.List;

public class WeatherForeCast {
    private WeatherResponse weatherResponse;
    private List<DayTemp> dayTemp;

    public WeatherForeCast() {}

    public WeatherForeCast(WeatherResponse weatherResponse, List<DayTemp> dayTemp) {
        this.weatherResponse = weatherResponse;
        this.dayTemp = dayTemp;
    }

    public WeatherResponse getWeatherResponse() {
        return weatherResponse;
    }

    public void setWeatherResponse(WeatherResponse weatherResponse) {
        this.weatherResponse = weatherResponse;
    }

    public List<DayTemp> getDayTemp() {
        return dayTemp;
    }

    public void setDayTemp(List<DayTemp> dayTemp) {
        this.dayTemp = dayTemp;
    }
}
