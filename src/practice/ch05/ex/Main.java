package practice.ch05.ex;

public class Main extends Thread {
    public static void main(String[] args) {
        // 스레드를 2개 만듬
        Thread a = new Main("ThreadA"); // 첫 번째 스레드
        Thread b = new Main("ThreadB"); // 두 번째 스레드
        Thread c = new Main("ThreadC"); // 세 번째 스레드

        // 스레드를 시작함
        a.start();
        b.start();
        c.start();
    }

    @Override
    // Thread의 run 메서드 오버라이딩
    // 이 스레드가 실행할 코드
    public void run() {
        Singleton singleton = Singleton.getInstance(); // 싱글톤 인스턴스를 얻음
        System.out.println(getName()+ ": " + singleton); // 인스턴스의 참조값
    }
    // 인자있는 생성자 추가
    public Main(String name) {
        super(name); // Thread의 생성자 호출
    }
}
