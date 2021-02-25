package ru.skvrez.decorator_example;

public abstract class AbstractNotifier implements Notifier {

    protected Notifier notifier;

    protected AbstractNotifier() {}

    protected AbstractNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public abstract void send(String message);
}
