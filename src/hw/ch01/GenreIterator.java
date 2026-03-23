package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class genreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String genre;
    private int index;
    
    public genreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
    }

    @Override
    public boolean  hasNext() {
        // 장르가 일치하는 책이 나올 때까지 인덱스 증가
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre() == genre) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
