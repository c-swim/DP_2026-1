package practice.ch05;

public class Main {
    public static void main(String[] args) {
        // 컴파일 에러: private 생성자
        // Singleton s1 = Singleton();

        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);

        // s2와 s3는 같은 객체를 참조하는지 비교
        if (s2 == s3) {
            System.out.println("s2와 s3는 같은 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 객체입니다.");
        }

        // enum 싱글톤 테스트
        Singleton2 s4 = Singleton2.INSTANCE;
        s4.hello();
    }
}
