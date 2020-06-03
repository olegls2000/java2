package lesson19;

public class ERRChanel implements Subscriber {
    @Override
    public void onForecast(WeatherData data) {
        System.out.println("ERR broadcasting T: " + data.getTemperature());
    }
}
