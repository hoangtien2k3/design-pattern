package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
