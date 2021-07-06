package com.android_note.design_pattern.observer_pattern;

public class CurrentConditions implements Observer {

    private double temperature;
    private double humidity;
    private double pressure;

    private WeatherData weatherData;

    public CurrentConditions(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }

    private void display() {
        System.out.println("***当前温度为：" + this.temperature + "***");
        System.out.println("***当前湿度为：" + this.humidity + "***");
        System.out.println("***当前气压为：" + this.pressure + "***");
    }

}
