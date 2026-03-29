package hw.ch03;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public int repeatCount; // 반복 횟수 저장 필드

    //기존 코드 호환성 유지. 횟수 불명시: 5번 반복
    public AbstractDisplay() {
        this(5);
    }
    
    //1. 반복 횟수를 조절 가능
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
