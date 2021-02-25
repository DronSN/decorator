package ru.skvrez.decorator_example;

public class WhatsUpNotifier extends AbstractNotifier{

    public WhatsUpNotifier() {
        super();
    }

    public WhatsUpNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.format("WhatsUp message: %s \n", message);
        if(notifier != null) {
            notifier.send(message);
        }
    }
}
