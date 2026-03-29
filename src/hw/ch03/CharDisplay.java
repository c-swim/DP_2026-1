package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자 

    // 생성자 
    public CharDisplay(char ch) {
        super(); // AbstractDisplay의 기본 생성자 호출
        this.ch = ch;
    }

    // 반복 횟수 지정 생성자
    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount);
        this.ch = ch;
    }

    @Override // 시작 문자열 "<<"를 표시한다 
    public void open() { System.out.print("<<"); }

    @Override // 필드에 저장해 둔 문자를 1회 표시한다
    public void print() { System.out.print(ch); }

    @Override // 종료 문자열 ">>"를 표시한다 
    public void close() { System.out.println(">>"); }
}
