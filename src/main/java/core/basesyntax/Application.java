package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball = new Lottery();
        for (int i = 0; i <= 2; i++) {
            System.out.println(ball.getRandomBall());
        }
    }
}
