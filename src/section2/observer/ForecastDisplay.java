package section2.observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
    @Override
    public void display() {
        System.out.print("予報：");
        if (currentPressure > lastPressure) System.out.println("天候は良くなります！");
        else if (currentPressure == lastPressure) System.out.println("ほどんど同じです");
        else if (currentPressure < lastPressure) System.out.println("寒い雨予報の天候に注意してください");
    }
}
