package Observables;


import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> itsObservers = new ArrayList<Observer>();

    public <T> void notifyObservers(T data) {
        for (Observer observer : itsObservers) {
            observer.update(data);
        }
    }

    public void addObserver(Observer myObserver) {
        itsObservers.add(myObserver);
    }

}
