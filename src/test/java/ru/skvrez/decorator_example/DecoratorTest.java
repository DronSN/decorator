package ru.skvrez.decorator_example;

import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void testWithOutDecorators() {
        Notifier telegram = new TelegramNotifier();
        Notifier whatsup = new WhatsUpNotifier();
        Notifier viber = new ViberNotifier();
        telegram.send("First message");
        whatsup.send("Second message");
        viber.send("Third message");
    }

    @Test
    void testDecorators() {
        Notifier telegram = new TelegramNotifier();
        Notifier whatsup = new WhatsUpNotifier(telegram);
        Notifier viber = new ViberNotifier(whatsup);
        viber.send("Decorator message");
    }
}
