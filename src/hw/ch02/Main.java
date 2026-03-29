package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240877 최영진");
        // 한국 콘센트 Adapter 로 충전

        // KoreanOutletAdapter 생성
        KoreanOutlet outlet = new KoreanOutlet();
        Charger adapter = new KoreanOutletAdapter(outlet);

        // Smartphone에 전달
        Smartphone myPhone = new Smartphone(adapter);

        // charge() 호출
        myPhone.charge();
    }
}
