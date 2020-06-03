package lesson19;

public class PostimeesChanel implements Subscriber {
    @Override
    public void onForecast(WeatherData data) {
        System.out.println("Postimees interested only in Wind: " + data.getWindDirection());
    }
}
