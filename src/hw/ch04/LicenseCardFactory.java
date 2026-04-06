package hw.ch04;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;   // 면허번호 카운터(100부터 시작)
    private String baseDate;            // 발급 기준 날짜

    // LicenseCard 생성자
    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate; // 발급 기준 날짜 설정
    }

    @Override
    protected Product createProduct(String holder) {
        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
    
}
