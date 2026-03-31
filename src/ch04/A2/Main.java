package ch04.A2;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();

        // 해시맵 테스트 코드 추가
        IDCardFactory idCardFactory = (IDCardFactory) factory;
        Map<Integer, String> owners = idCardFactory.getOwners();
        System.out.println("등록된 카드 수: " + owners.size());
        System.out.println("대응표 내용:");
        for (Map.Entry<Integer, String> entry : owners.entrySet()) {
            System.out.println("시리얼 번호: " + entry.getKey() + ", 오너: " + entry.getValue());
        }
        // 특정 시리얼 번호로 조회 테스트
        int testSerial = 101;
        String owner = owners.get(testSerial);
        if (owner != null) {
            System.out.println("시리얼 번호 " + testSerial + "의 오너: " + owner);
        } else {
            System.out.println("시리얼 번호 " + testSerial + "을 찾을 수 없습니다.");
        }
    }
}
