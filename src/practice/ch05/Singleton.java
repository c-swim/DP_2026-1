package practice.ch05;

// 싱글톤 패턴 적용하기
public class Singleton {
    // (3) Singleton 객체를 미리 하나 만들어서 static 변수에 저장해 놓는다.
    private static Singleton singleton = new Singleton();

    // (1) 생성자를 private으로 한다.
    private Singleton() { // private 생성자: 외부에서 인스턴스 생성 불가
        System.out.println("Singleton 객체가 생성됩니다.");
    }

    // (2) Singleton 객체를 얻어가는 static 메소드를 정의한다.
    public static Singleton getInstance() { // 싱글톤 인스턴스를 반환하는 메서드
        // (1) return new Singleton();
        return singleton; 
    }
}
