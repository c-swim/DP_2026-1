package practice.ch04;

// import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;
import practice.ch04.framework.Product;

public class Main {
    public static void main(String[] args) {
        // IDCard c = new IDCard("홍길동");
        // c.use();

        // 공장을 통해서 IDcard를 만들어보자.
        IDCardFactory f = new IDCardFactory();
        Product c = f.create("홍길동");
        c.use();
    }
}
