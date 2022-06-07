package Observers;

public class MSPressObserver implements Observer {
    MonitoringScreen itsMonitoringScreen;
    public MSPressObserver(MonitoringScreen monitoringScreen) {
        System.out.println("MSPressObserver was created");
        itsMonitoringScreen = monitoringScreen;
    }

    @Override
    public void update(Object data) {
        if (data instanceof Integer)
            itsMonitoringScreen.displayPressure((int)data);
    }
}
