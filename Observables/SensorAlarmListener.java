package Observables;

public class SensorAlarmListener   implements AlarmListener{
    Sensor itsSensor;

    public SensorAlarmListener(Sensor itsSensor) {
        this.itsSensor = itsSensor;
    }

    @Override
    public void wakeUp() {
        itsSensor.check();
    }

}
