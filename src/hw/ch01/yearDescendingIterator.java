package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class yearDescendingIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private boolean[] visited;  // 이미 반환한 책인가?
    private int count;          // 반환한 책의 개수
    
    public yearDescendingIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.visited = new boolean[bookShelf.getLength()];
        this.count = 0;
    }

    @Override
    public boolean  hasNext() {
        return count < bookShelf.getLength();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        
        int index = -1;     // 가장 최신 책의 인덱스
        int maxYear = -1;   // 가장 최신 책의 출판연도
        
        //전체 배열 탐색 -> 방문하지 않은 책 중 연도가 가장 큰 책 찾기
        for (int i=0; i < bookShelf.getLength(); i++) {
            if (!visited[i]) {
                Book currentBook = bookShelf.getBookAt(i);
                int currentYear = currentBook.getYear();

                // 첫 배열 탐색일 경우, 찾은 연도보다 더 큰 연도인 경우 갱신
                if (index == -1 || currentYear > maxYear) {
                    maxYear = currentBook.getYear();
                    index = i;
                }
            }
        }
        // 모든 책을 반환 했음에도 한번 더 호출할 경우
        if (index == -1) {
            throw new NoSuchElementException();
        }
        
        // 찾은 책 -> 방문처리 / 카운트 증가 후 return
        visited[index] = true;
        count++;
        return bookShelf.getBookAt(index);
    }
}
