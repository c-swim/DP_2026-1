package hw.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    // [3-1] 장르 필터 Iterator
    public Iterator<Book> iteratorByGenre(String genre) {
        return new genreIterator(this, genre);
    }

    // 출판연도 역순 Iterator
    public Iterator<Book> iteratorByYear() {
        return new yearDescendingIterator(this);
    }
}
