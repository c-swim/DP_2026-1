package hw.ch02;

// 전자기기는 원하는 전압을 `charge()`로 요청 
// 모든 전자기기가 동일한 인터페이스 사용하도록 함
public interface Charger { 
    public int charge();
}