package Observables;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> itsObservers = new ArrayList<Observer>();

    public void notifyObservers(int data) {
        for (Observer observer : itsObservers) {
            observer.update(data);
        }
    }


}