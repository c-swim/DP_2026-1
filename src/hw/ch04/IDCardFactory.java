package hw.ch04;

public class IDCardFactory extends Factory {
    private int serial = 100;   // 카드 일련 번호 초기값
    private String baseDate;    // 카드 발급 날짜의 기준이 되는 날짜

    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate; 
    }

    @Override
    // baseDate를 사용하여 발급 날짜 설정
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++, baseDate); 
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}