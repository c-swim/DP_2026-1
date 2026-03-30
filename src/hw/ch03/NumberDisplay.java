package hw.ch03;
// 숫자를 반복 표시하는 클래스
public class NumberDisplay extends AbstractDisplay {
    private int number;

    // 생성자
    public NumberDisplay(int number, int repeatCount) {
        // AbstractDisplay의 생성자 호출 -> 반복 횟수 설정
        super(repeatCount);
        this.number = number;
    }

    @Override // <<Number>>를 한 줄에 출력
    public void open() { System.out.println("<<Number>>"); }

    @Override // 숫자를 한 줄에 하나씩 출력
    public void print() { System.out.println(number); }

    @Override // <<Number>>를 한 줄에 출력
    public void close() { System.out.println("<<Number>>"); }
}
