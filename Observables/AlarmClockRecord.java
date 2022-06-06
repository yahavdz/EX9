package Observables;

public class AlarmClockRecord {
    private int interval;
    private AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        this.alarmListener = alarmListener;
        this.interval = interval;
    }
}
