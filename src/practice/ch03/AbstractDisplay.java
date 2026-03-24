package practice.ch03;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    // // display는 
    // // 큰 틀을 제공하는 메소드 -> 템플릿 메소드
    // public final void display() {       // final이 붙은 메소드는 하위 클래스에서 오버라이드 할 수 없음
    //     open();                         // (자식들이 큰 흐름을 수정 불가)
    //     for (int i = 0; i < 5; i++) {   
    //         print();                    
    //     }
    //     close();
    // }

    //3-3 인터페이스 defalt 구현 정의 (A1의 AbstractDisplay)
    public default void display() {       // final이 붙은 메소드는 하위 클래스에서 오버라이드 할 수 없음
        open();                         // (자식들이 큰 흐름을 수정 불가)
        for (int i = 0; i < 5; i++) {   
            print();                    
        }
        close();
    }
}
