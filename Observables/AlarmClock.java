package Observables;

import java.util.ArrayList;

public class AlarmClock
{
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private static ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();
    int ticUnit =100; //could be different to change speed
    static int i=0;

    protected AlarmClock() {}
    public static AlarmClock theInstance()
    {
        if(null==instance)
            instance = new AlarmClock();
        return instance;
    }

    protected void tic() {
        //System.out.println(i++);
        for (AlarmClockRecord record : itsAlarmClockRecords) {
            if (record.getRemainingTime()-ticUnit <= 0){
                record.alarmListener.wakeUp();
                record.setRemainingTime(record.getInterval());
            }
            else
            {
                record.decrementRemainingTime(ticUnit);
            }
            //System.out.println("remaining time is: "+record.getRemainingTime());
        }
    }


    public void register(int interval, AlarmListener pal) {
        itsAlarmClockRecords.add(new AlarmClockRecord(interval, pal));
    }
}

