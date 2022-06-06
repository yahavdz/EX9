package Nimbus1;

import Observables.AlarmClock;
import Observables.AlarmListener;
import Observables.Sensor;
import Observables.SensorAlarmListener;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {

    private final int minTemp = 950;
    private final int maxTemp = 1050;
    private final int interval = 700;

    Random rnd;

    public Nimbus1TemperatureSensor(String type, int interval) {
        super(type, interval);
        rnd = RandomSupplier.getRnd();
        (AlarmClock.theInstance()).register(interval, new SensorAlarmListener(this));
    }

    @Override
    public int read() {
        return rnd.nextInt(minTemp, maxTemp + 1);
    }
}
