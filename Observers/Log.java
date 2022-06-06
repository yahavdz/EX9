package Observers;

import Observables.WeatherMonitoringSystem;

public class Log {
    public Log(WeatherMonitoringSystem ws) {
    }
    public void displayPressure(int data) {
        System.out.println("Log: pressure = "+data+" millibars");
    }

    public void displayPressureTrend(Trend trend){
        System.out.println("Log: pressure trend = "+ trend);

    }
}
