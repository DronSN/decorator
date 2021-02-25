package ru.skvrez.decorator_example;

public class TelegramNotifier extends AbstractNotifier{

    public TelegramNotifier() {
        super();
    }

    public TelegramNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        System.out.format("Telegram message: %s \n", message);
        if(notifier != null) {
            notifier.send(message);
        }
    }
}
