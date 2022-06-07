package Nimbus1;

import java.util.Random;

public class Nimbus1PressureSensor extends Sensor{

    private final int minPressure = 950;
    private final int maxPressure = 1050;

    Random rnd;
    public Nimbus1PressureSensor(String type, int interval) {
        super(type, interval);
        rnd = RandomSupplier.getRnd();
        (AlarmClock.theInstance()).register(interval, new SensorAlarmListener(this));
        System.out.println(type+" registered to clock");
    }

    @Override
    public int read() {
        return rnd.nextInt(maxPressure- minPressure) + minPressure;
    }
}
