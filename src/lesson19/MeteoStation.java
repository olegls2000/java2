package lesson19;

import java.util.HashSet;
import java.util.Set;

public class MeteoStation {

    private Set<Subscriber> subscribers;

    public MeteoStation() {
        this.subscribers = new HashSet<>();
    }

    public void subscribe(Subscriber newSubscriber) {
        subscribers.add(newSubscriber);
    }

    public void checkForecast() {
        WeatherData weatherData = new WeatherData();
        for (Subscriber subscriber : subscribers) {
            subscriber.onForecast(weatherData);
        }
    }
}
