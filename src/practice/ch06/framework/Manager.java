package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    // Product: 부모 타입 => 모든 종류의 자식 Product 객체를 관리할 수 있음
    private Map<String,Product> showcase = new HashMap<>(); // (key, value) 쌍을 관리

    // 원본을 등록하는 메소드
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); // 등록할 때 이름을 key로 해서 원본 객체를 가져옴
        return p.createCopy();
    }
}
