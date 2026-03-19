package practice.ch02.inheritance;

// 클라이언트가 원하는 인터페이스를 구현한 어댑터 클래스
public class PrintBannerAdapter01 extends Banner implements Print{
    // (1) 인자가 없는 생성자는 자동으로 만들어짐
    // (2) 생성자는 상속되지 않는다. -> 부모 생성자 호출

    // 생성자
    public PrintBannerAdapter01(String string) {
        super(string); // 부모 생성자를 호출함
    }

    // 상속
    @Override
    public void printWeak() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
    
}
