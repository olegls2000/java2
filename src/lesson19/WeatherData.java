package lesson19;

import java.util.Random;
import java.util.UUID;

import static utils.MyUtils.getRandomFromRange;

public class WeatherData {
    private int temperature;
    private int windSpeed;
    private String windDirection;

    public WeatherData() {
        temperature = getRandomFromRange(-5, 35);
        windSpeed = new Random().nextInt(30);
        windDirection = UUID.randomUUID().toString();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", windDirection='" + windDirection + '\'' +
                '}';
    }
}
