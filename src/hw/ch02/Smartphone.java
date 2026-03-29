package hw.ch02;

public class Smartphone {
    private Charger charger;
    
    // 생성자
    public Smartphone(Charger charger) {
        this.charger = charger;
    }
    
    public void charge() {
        int voltage = charger.charge();
        System.out.println("스마트폰이 " + voltage + "V 에서 충전합니다.");
    }
}