package Observables;

public abstract class Sensor extends Observable {

    protected int lastReading;
    protected int interval;
    protected String type;

    public Sensor(String type, int interval) {
        this.interval = interval;
        this.type = type;
    }

    public abstract int read();

    public void check() {
        int temp = read();
        if (lastReading != temp) {
            lastReading = temp;
            notifyObservers(lastReading);
        }
    }

}
