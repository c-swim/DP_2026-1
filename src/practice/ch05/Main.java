package practice.ch05;

public class Main {
    //Singleton s1 = new Singleton(); // 컴파일 에러: Singleton 클래스의 생성자가 private이므로 외부에서 인스턴스 생성 불가
    Singleton s2 = Singleton.getInstance(); // 싱글톤 인스턴스 얻기
    Singleton s3 = Singleton.getInstance(); // 같은 인스턴스 반환


    // true 출력: s2와 s3는 같은 인스턴스
    System.out.println("s2: " + s2); 
    System.out.println("s3: " + s3); 
}
