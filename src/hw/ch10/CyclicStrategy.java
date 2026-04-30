package hw.ch10;

public class CyclicStrategy implements Strategy {
    // 0: 바위, 1: 가위, 2: 보 순서
    private int prevHandValue = -1; 

    @Override
    public Hand nextHand() {
        // 호출될 때마다 0 -> 1 -> 2 -> 0 순으로 증가
        prevHandValue = (prevHandValue + 1) % 3;
        return Hand.getHand(prevHandValue);
    }

    @Override
    public void study(boolean win) {
        // 아무 작업도 하지 않음 
    }
}