package Observers;

public class Log {
    public Log(WeatherMonitoringSystem ws) {
        System.out.println("Log was created");
        ws.addIntPressureObserver(new LogPressObserver(this));
        System.out.println("LogPressObserver observes pressure");
        ws.addTrendPressureObserver(new LogPressTrendObserver(this));
        System.out.println("LogPressTrendObserver observes pressure trend");

    }
    public void displayPressure(int data) {
        System.out.println("Log: pressure = "+data+" millibars");
    }

    public void displayPressureTrend(Trend trend){
        System.out.println("Log: pressure trend = "+ trend);

    }

}
