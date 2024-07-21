package francisco.barbosa.gofpatterns.strategy.solution.behaviors;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        log.info("fly no way");
    }
}
