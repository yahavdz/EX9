package Observers;

public class LogPressObserver implements Observer {
    Log itsLog;
    PressureTrendSensor itsPressureTrendSensor;
    public LogPressObserver(Log log) {
        System.out.println("LogPressObserver was created");
        itsLog = log;

    }

    @Override
    public void update(Object data) {
        if (data instanceof Integer) {
            itsLog.displayPressure((int) data);

        }
    }
}
