package francisco.barbosa.gofpatterns.observer.mysolution;

import lombok.Getter;

@Getter
public class WeatherData {
    SensorData sensorData;
    DataDisplay dataDisplay;
    public void measurementsChanged() {
        dataDisplay.update(sensorData);
    }

}
