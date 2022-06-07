package Observables;

public class AlarmClockRecord {
    int remainingTime;
    int interval;
    AlarmListener alarmListener;

    public AlarmClockRecord(int interval, AlarmListener alarmListener) {
        remainingTime = this.interval = interval;
        this.alarmListener = alarmListener;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public AlarmListener getAlarmListener() {
        return alarmListener;
    }


    public void decrementRemainingTime(int ticUnit){
        remainingTime-= ticUnit;
    }
}
