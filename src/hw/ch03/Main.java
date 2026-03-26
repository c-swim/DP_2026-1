package hw.ch03;

public class Main {
    public static void main(String[] args) {
        CharDisplay d1 = new CharDisplay('H'); // '': char, "": String
        d1.display();

        // StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();
 
       // AbstractDisplay d3 = new AbstractDisplay();
    }
}
