package Observers;

public class LogPressTrendObserver implements Observer {
    Log itsLog;
    public LogPressTrendObserver(Log log) {
        System.out.println("LogPressTrendObserver was created");
        itsLog = log;
    }


    @Override
    public void update(Object data) {
        if (data instanceof Trend)
            itsLog.displayPressureTrend((Trend) data);
    }

}
