package practice.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;      // 직전에 낸 손
    private int currentHandValue = 0;   // 이번에 낼 손(가장 최근에 낸 손의 값)
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    // 다음에 낼 손을 결정한다
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        // 손 switching
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;

        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) { // 행의 합 구하기
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            // 그 행의 모든 열을 더함
            sum += history[handvalue][i];   // 행번호 고정, 열번호 0,1,2로 변화
            
        }
        return sum;
    }

    @Override
    // 다음 전략을 위한 준비. 
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
