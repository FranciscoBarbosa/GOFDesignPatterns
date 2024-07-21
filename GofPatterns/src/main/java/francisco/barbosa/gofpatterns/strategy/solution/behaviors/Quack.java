package francisco.barbosa.gofpatterns.strategy.solution.behaviors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        log.info("quack");
    }
}
