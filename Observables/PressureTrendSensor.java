package Observables;

public class PressureTrendSensor extends Observable implements Observer {
    int lastReading1;
    int lastReading2;
    int lastReading3;
    Trend pressureState;
    Trend lastState;


    public PressureTrendSensor() {
        pressureState = Trend.STABLE;
    }
    
    public Trend calc() {
        if (lastReading3 < lastReading2 && lastReading2 < lastReading1)
            return Trend.RISING;
        if (lastReading3 > lastReading2 && lastReading2 > lastReading1)
            return Trend.FALLING;
        return Trend.STABLE;
    }

    public void check() {
        lastState = pressureState;
        pressureState = calc();
        if (lastState != pressureState) {
            notifyObservers(pressureState);
        }
    }


    @Override
    public <T> void update(T data) {
        if (data instanceof Integer) {
            lastReading3 = lastReading2;
            lastReading2 = lastReading1;
            lastReading1 = (Integer)data;
            check();
        }
    }

}

