package francisco.barbosa.gofpatterns.observer.solution;

import org.junit.jupiter.api.Test;


class WeatherDataTest {

    @Test
    void shouldDisplay(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay statisticsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(78, 90, 29.2f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}