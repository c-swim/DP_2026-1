package practice.ch03;

public class Main {
    public static void main(String[] args) {
        CharDisplay d1 = new CharDisplay('H'); // '': char, "": String
        d1.display();
        // 부모타입으로 선언
        AbstractDisplay d2 = new CharDisplay('H'); // '': char, "": String
        d2.display();

        // StringDisplay d3 = new StringDisplay("Hello, world.");
        // d3.display();
        // AbstractDisplay d4 = new StringDisplay("Hello, world.");
        // d4.display();

        // 잘못된 코드, 추상클래스는 인터페이스를 만들 수 없음
       // AbstractDisplay d3 = new AbstractDisplay();
    }
}
