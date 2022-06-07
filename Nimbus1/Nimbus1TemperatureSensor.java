package Nimbus1;

import java.util.Random;

public class Nimbus1TemperatureSensor extends Sensor {

    private final int minTemp = 0;
    private final int maxTemp = 40;


    Random rnd;

    public Nimbus1TemperatureSensor(String type, int interval) {
        super(type, interval);
        rnd = RandomSupplier.getRnd();
        (AlarmClock.theInstance()).register(interval, new SensorAlarmListener(this));
        System.out.println(type+" registered to clock");
    }

    @Override
    public int read() {
        return rnd.nextInt(maxTemp-minTemp)+minTemp;
    }
}
