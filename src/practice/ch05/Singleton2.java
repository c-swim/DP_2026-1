package practice.ch05;

public enum Singleton2 {
    // enum을 이용한 싱글톤 패턴
    INSTANCE; // 상수 : 싱글톤2 Type의 객체 생성, 저장

    public void hello() {
        System.out.println("싱글톤 객체의 hello 메소드가 호출되었습니다.");
    }
}
