package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("클린코드"));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌"));
        bookShelf.appendBook(new Book("사피엔스"));
        bookShelf.appendBook(new Book("이펙티브 자바"));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해"));
        bookShelf.appendBook(new Book("레미제라블"));
        bookShelf.appendBook(new Book("총균쇠"));
        bookShelf.appendBook(new Book("리팩터링"));
        bookShelf.appendBook(new Book("로마인 이야기"));
        bookShelf.appendBook(new Book("어린왕자"));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법 
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
