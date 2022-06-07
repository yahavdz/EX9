package Observers;

public class MonitoringScreen {
    public MonitoringScreen(WeatherMonitoringSystem ws) {
        System.out.println("MonitoringScreen was created");
        ws.addTemperatureObserver(new MSTempObserver(this));
        System.out.println("MSTempObserver observes temperature");
        ws.addIntPressureObserver(new MSPressObserver(this));
        System.out.println("MSPressObserver observes pressure");

    }

    public void displayPressure(int data) {
        System.out.println("MonitoringScreen: pressure = "+data+" millibars");
    }
    public void displayTemperature(int data) {
        System.out.println("MonitoringScreen: temperature = "+data+" Celsius");
    }
}
