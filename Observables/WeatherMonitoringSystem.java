package Observables;

import java.util.ArrayList;

public class WeatherMonitoringSystem {
    private final int tempInterval = 700;
    private final int pressInterval = 1100;
    static WeatherMonitoringSystem instance;
    
    private Nimbus1Clock nimbus1Clock;
    private Nimbus1TemperatureSensor nimbus1TemperatureSensor;
    private Nimbus1PressureSensor nimbus1PressureSensor;
    public PressureTrendSensor pressureTrendSensor;

    public WeatherMonitoringSystem() {
        System.out.println("WeatherMonitoringSystem was created");
        nimbus1Clock = new Nimbus1Clock();
        nimbus1PressureSensor  = new Nimbus1PressureSensor("pressure", pressInterval);
        nimbus1TemperatureSensor= new Nimbus1TemperatureSensor("temperature", tempInterval);
    
        pressureTrendSensor = new PressureTrendSensor( );
        nimbus1PressureSensor.addObserver(pressureTrendSensor);
        System.out.println("PressureTrendSensor observes pressure");
    }

    public static WeatherMonitoringSystem theInstance() {
        if(null==instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }
    public void addIntPressureObserver(Observer observer){
        nimbus1PressureSensor.addObserver(observer);
    }
    public void addTrendPressureObserver(Observer observer){
        pressureTrendSensor.addObserver(observer);
    }
   
    public void addTemperatureObserver(Observer observer){
        nimbus1TemperatureSensor.addObserver(observer);
    }

}
