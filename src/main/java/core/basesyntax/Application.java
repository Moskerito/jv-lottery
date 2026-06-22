package core.basesyntax;

import java.util.Arrays;

public class Application {
    private static final int ballsAmount = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        Ball[] balls = new Ball[ballsAmount];
        for (int i = 0; i < balls.length; i++) {
            balls[i] = lottery.getRandomBall();
        }
        System.out.println(Arrays.toString(balls));
    }
}
