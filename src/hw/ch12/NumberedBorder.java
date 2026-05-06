package hw.ch12;

public class NumberedBorder extends Border {
    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        // 내용물 폭 + 행 번호 영역(4글자) 
        return display.getColumns() + 4;
    }

    @Override
    public int getRows() {
        // 내용물과 동일한 행 수 반환 
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // "%2d| " 형식으로 행 번호(1부터 시작) + 기존 텍스트 결합 
        return String.format("%2d| ", row + 1) + display.getRowText(row);
    }
}