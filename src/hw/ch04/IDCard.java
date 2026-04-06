package hw.ch04;

public class IDCard extends Product {
    private String owner;
    private int serial;         // 카드 일련 번호
    private String issuedDate;  // 필드 추가: 카드 발급 날짜

    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }
    // 생성자 추가
    public IDCard(String owner, int serial, String issuedDate) {
        this(owner);            // 기존 생성자 호출하여 owner 초기화
        this.serial = serial;
        this.issuedDate = issuedDate;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    // 카드 발급 날짜를 포함한 문자열 반환
    public String toString() {
        return "[" + serial + "]: " + owner + " (발급일: " + issuedDate + ")";
    }

    // getters
    public String getOwner() { return owner; }
    // 발급 날짜 getter 추가
    public String getIssuedDate() { return issuedDate; }
    // 일련 번호 getter 추가
    public int getSerial() { return serial; }
}
