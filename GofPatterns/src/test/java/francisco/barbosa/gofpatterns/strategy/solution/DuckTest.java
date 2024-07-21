package francisco.barbosa.gofpatterns.strategy.solution;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import francisco.barbosa.gofpatterns.strategy.solution.behaviors.FlyNoWay;
import francisco.barbosa.gofpatterns.strategy.solution.behaviors.FlyWithWings;
import francisco.barbosa.gofpatterns.strategy.solution.behaviors.Quack;
import francisco.barbosa.gofpatterns.strategy.solution.behaviors.Squeak;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuckTest {

    @Test
    void shouldQuackAndFlyWithWings(){
        Logger flyWithWingsLogger = (Logger) LoggerFactory.getLogger(FlyWithWings.class);
        Logger quackLogger = (Logger) LoggerFactory.getLogger(Quack.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        flyWithWingsLogger.addAppender(listAppender);
        quackLogger.addAppender(listAppender);

        Duck duck =  new MallardDuck(new FlyWithWings(), new Quack());
        duck.fly();
        duck.quack();

        List<ILoggingEvent> logsList = listAppender.list;
        assertEquals("fly with wings", logsList.get(0).getMessage());
        assertEquals("quack", logsList.get(1).getMessage());
    }

    @Test
    void shouldSqueakAndFlyNoWay(){
        Logger flyNoWayLogger = (Logger) LoggerFactory.getLogger(FlyNoWay.class);
        Logger squeakLogger = (Logger) LoggerFactory.getLogger(Squeak.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        flyNoWayLogger.addAppender(listAppender);
        squeakLogger.addAppender(listAppender);

        Duck duck =  new RubberDuck(new FlyNoWay(), new Squeak());
        duck.fly();
        duck.quack();

        List<ILoggingEvent> logsList = listAppender.list;
        assertEquals("fly no way", logsList.get(0).getMessage());
        assertEquals("squeak", logsList.get(1).getMessage());
    }
}
