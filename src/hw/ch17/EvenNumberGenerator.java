package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int currentNumber;

    public EvenNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int getNumber() {
        return currentNumber;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i += 2) {
            currentNumber = i;
            notifyObservers();
        }
    }
}