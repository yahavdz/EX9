package Nimbus1;

import Observables.AlarmClock;
import Observables.AlarmListener;
import Observables.Sensor;

public class Nimbus1PressureSensor extends Sensor implements AlarmListener {

    private final int minPressure = 950;
    private final int maxPressure = 1050;
    private final int interval = 1100;

    public Nimbus1PressureSensor(String type) {
        super(type, interval);
        AlarmClock
    }

    @Override
    public int read() {
        return RandomSupplier.getRnd().nextInt(minPressure, maxPressure + 1);
    }
}
