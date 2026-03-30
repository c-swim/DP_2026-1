package hw.ch02;

// 220V를 그대로 반환
// Charger 인터페이스 구현 -> 위임(Delegation)을 이용
public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet koreanOutlet; // KoreanOutlet 포함
    
    // 생성자
    public KoreanOutletAdapter(KoreanOutlet koreanOutlet) {
        this.koreanOutlet = koreanOutlet;
    }

    @Override
    public int charge() {
        // KoreanOutlet 의 provide()를 charge()로 변환 
        return koreanOutlet.provide();
    }
}