package practice.ch02.Delegation;

public class Main {
    // 이미 제공되는 클래스, vendor 클래스, 수정 불가
    void main(String[] args) {
        //어댑터 이용
        System.out.println("=== 어댑터 이용 ===");
        Print print = new PrintBannerAdapter02("Hello World");
        print.printWeak();
        print.printStrong();
    }
}
