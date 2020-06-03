package lesson19;

public class DelfiChanel implements Subscriber {
    @Override
    public void onForecast(WeatherData data) {
        System.out.println("Delfi  provides detail forecast: " + data);
    }
}
