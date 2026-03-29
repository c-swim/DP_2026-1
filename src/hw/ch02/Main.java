package hw.ch02;

public class Main {
    public static void main(String[] args) {
        // 1. 기존의 한국 콘센트 객체 준비
        KoreanOutlet outlet = new KoreanOutlet();

        // 2. 콘센트를 어댑터에 끼움, Adapter 생성
        Charger adapter = new KoreanOutletAdapter(outlet);

        // 3. 스마트폰에 어댑터(충전기)를 연결
        Smartphone myPhone = new Smartphone(adapter);

        // 4. 충전 시작
        myPhone.charge();
    }
}
