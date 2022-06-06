package Observers;

public class MSPressObserver implements Observer {
    MonitoringScreen itsMonitoringScreen;
    public MSPressObserver(MonitoringScreen monitoringScreen) {
        itsMonitoringScreen = monitoringScreen;
    }

    @Override
    public void update(int data) {
        itsMonitoringScreen.displayPressure(data);
    }
}
