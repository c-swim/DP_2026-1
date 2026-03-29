package hw.ch02;

// provide( )라는 api로 전압을 제공함 
// 외부 라이브러리처럼 수정이 불가능함 
public class KoreanOutlet {
    public int provide() {
        System.out.println("한국 콘센트에서 220V AC 를 제공합니다.");
        return 220;  // 220V
    }
}