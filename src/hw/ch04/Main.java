package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
import hw.ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240877 최영진\n==================");
        //[3-1] IDCard 정보 확장
        Factory factory = new IDCardFactory("2026-06-01");
        Product card1 = factory.create("Kim Youngjin");
        Product card2 = factory.create("Son Heungmin");
        card1.use();
        card2.use();
        System.out.println();

        //[3-2] 새로운 카드 타입
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}