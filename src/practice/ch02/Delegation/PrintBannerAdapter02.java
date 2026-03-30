package practice.ch02.Delegation;

// 자바에서는 다중 상속이 불가능함(부모가 둘 이상은 허용이 안됨)
// 추상 클래스 Print을 상속받는 어댑터 클래스
public class PrintBannerAdapter02 extends Print{
    private Banner banner; // Banner를 가지고 있다가 Banner에게 시키기.

    // 생성자
    public PrintBannerAdapter02(String string) {
        this.banner = new Banner(string);   // Banner 클래스의 인스턴스를 생성하여 필드에 할당
    }

    // 상속
    @Override
    public void printWeak() {
        banner.showWithParen(); 
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
    
}
