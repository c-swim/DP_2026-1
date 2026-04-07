package ch04.A2.idcard;


import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory extends Factory {
    private int serial = 100;
    private Map<Integer, String> owners = new HashMap<>();
    private Map<Integer, String> owners = new HashMap<>();

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        owners.put(idCard.getSerial(), idCard.getOwner());
        owners.put(((IDCard) product).getSerial(), ((IDCard) product).getOwner());
        System.out.println(product + "을 등록했습니다.");
    }
}
