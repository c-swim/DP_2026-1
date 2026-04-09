package practice.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;          // 랜덤 난수
    private boolean won = false;    // 승부 결과
    private Hand prevHand;          // 이전에 낸 손

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { // 졌다면..
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
