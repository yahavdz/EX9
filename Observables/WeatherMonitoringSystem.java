package Observables;

import Nimbus1.Nimbus1Clock;
import Nimbus1.Nimbus1TemperatureSensor;
import Observers.Observer;

import java.util.ArrayList;

public class WeatherMonitoringSystem {

    static WeatherMonitoringSystem instance;
    private ArrayList<Observer> itsObservers = new ArrayList();
    private Nimbus1Clock nimbus1Clock = new Nimbus1Clock();
    private Nimbus1TemperatureSensor nimbus1TemperatureSensor = new Nimbus1TemperatureSensor("Monitor", 60);



    public static WeatherMonitoringSystem theInstance() {
        if(null==instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
    public void addPressureObserver(Observer observer){
        itsObservers.add(observer);
    }
    //public void addPressureTrendObserver(Observer observer){} TODO
    public void addTemperatureObserver(Observer observer){
        itsObservers.add(observer);
        nimbus1TemperatureSensor.addObserver(observer);
    }

}
