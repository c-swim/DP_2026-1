package hw.ch01;
//요구사항: 기존 Book(String name) 생성자 유지, 새 필드를 받는 생성자를 오버로딩으로 추가.
// setter는 만들지 않는다
// Main.java의 기존 코드가 수정없이 컴파일 되어야 한다.

public class Book {
    private String name;
    private String genre;   // 장르: "소설", "과학", "역사", "기술" 등
    private int year;       // 출판 연도 (예: 2008)
    private double price;   // 가격 (단위: 원, 예: 30000)

    // 기존 Book 생성자 유지
    public Book(String name) {
        this.name = name;
    }

    // 새 필드를 받는 생성자를 오버로딩
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
