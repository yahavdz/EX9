package Nimbus1;

import Observables.AlarmClock;
import Observables.AlarmListener;
import Observables.Sensor;
import Observables.SensorAlarmListener;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor  {

    private final int minPressure = 950;
    private final int maxPressure = 1050;
    private final int interval = 1100;

    Random rnd;
    public Nimbus1PressureSensor(String type, int interval) {
        super(type, interval);
        rnd = RandomSupplier.getRnd();
        (AlarmClock.theInstance()).register(interval, new SensorAlarmListener(this));
    }


    @Override
    public int read() {
        return rnd.nextInt(minPressure, maxPressure + 1);
    }
}
