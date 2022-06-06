package Nimbus1;

import Observables.AlarmClock;
import Observables.AlarmListener;
import Observables.Sensor;

public class Nimbus1TemperatureSensor extends Sensor implements AlarmListener {

    private final int minTemp = 950;
    private final int maxTemp = 1050;
    private final int interval = 700;


    public Nimbus1TemperatureSensor(String type, AlarmClock ac) {
        super(type, interval);
        ac.register(interval);
    }

    @Override
    public int read() {
        return RandomSupplier.getRnd().nextInt(minTemp, maxTemp + 1);
    }
}
