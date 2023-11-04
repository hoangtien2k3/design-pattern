package Behavioral.Observer.java;

public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}
