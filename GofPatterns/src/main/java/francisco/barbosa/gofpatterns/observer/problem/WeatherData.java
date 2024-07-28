package francisco.barbosa.gofpatterns.observer.problem;

import lombok.Getter;

@Getter
public class WeatherData {
    // instance variable declarations
    float temperature;
    float humidity;
    float pressure;

    CurrentConditionsDisplay currentConditionsDisplay;
    StatisticsDisplay statisticsDisplay;
    ForecastDisplay forecastDisplay;
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }

}
