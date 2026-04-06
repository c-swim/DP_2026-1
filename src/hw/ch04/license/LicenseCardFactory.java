package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;   // 면허번호 카운터(100부터 시작)
    private String baseDate;            // 발급 기준 날짜

    // LicenseCard 생성자
    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate; // 발급 기준 날짜 설정
    }

    @Override
    protected Product createProduct(String holder) {
        // 발급 날짜 계산 (baseDate로부터 5년 후)
        // String "YYYY-MM-DD"을 실제 날짜 객체로 변환
        java.time.LocalDate date = java.time.LocalDate.parse(baseDate);
        // 5년 더하고 하루 빼기
        java.time.LocalDate expiry = date.plusYears(5).minusDays(1);    
        // 다시 문자열로 변환
        String expiryDate = expiry.toString();

        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + " 을 등록했습니다.");
    }
    
}
