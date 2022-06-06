package Observers;

public class MSTempObserver implements Observer{
    MonitoringScreen itsMonitoringScreen;


    public MSTempObserver(MonitoringScreen monitoringScreen) {
        itsMonitoringScreen = monitoringScreen;
    }

    @Override
    public void update(int data) {
        itsMonitoringScreen.displayTemperature(data);
    }
}
