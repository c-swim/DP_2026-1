package hw.ch03;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();
    public int repeatCount; // 반복 횟수 변수

    // 횟수 불명시: 5번 반복
    public default void display() {
        open();                      
        for (int i = 0; i < 5; i++) {   
            print();                    
        }
        close();
    }
    
    //1. 반복 횟수를 조절 가능
    public AbstractDisplay(int repeatCount) {
        open();                         
        this.repeatCount = repeatCount; // 매개변수로 받은 반복 횟수를 필드에 저장
        for (int i = 0; i < repeatCount; i++) {   
            print();                    
        }
        close();
    }
}
