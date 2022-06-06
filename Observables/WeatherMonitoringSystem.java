package Observables;

import Nimbus1.Nimbus1Clock;

public class WeatherMonitoringSystem {

    WeatherMonitoringSystem instance;
    public static WeatherMonitoringSystem theInstance()
    {
        if(null==instance)
            instance = new WeatherMonitoringSystem();
        return instance;
    }

}
