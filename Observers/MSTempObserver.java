package Observers;

public class MSTempObserver implements Observer{
    MonitoringScreen itsMonitoringScreen;

    public MSTempObserver(MonitoringScreen monitoringScreen) {
        System.out.println("MSTempObserver was created");
        itsMonitoringScreen = monitoringScreen;
    }

    @Override
    public void update(Object data) {
        if (data instanceof Integer)
            itsMonitoringScreen.displayTemperature((int)data);
    }
}
