package ru.skvrez.decorator_example;

public class ViberNotifier extends AbstractNotifier{

    public ViberNotifier() {
        super();
    }

    public ViberNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.format("Viber message: %s \n", message);
        if(notifier != null) {
            notifier.send(message);
        }
    }
}
