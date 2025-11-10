package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        String color = colorSupplier.getRandomColor();
        int max = 100;
        int number = random.nextInt(max);
        return new Ball(number, color);
    }
}
