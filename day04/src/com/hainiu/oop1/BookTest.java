package com.hainiu.oop1;

public class BookTest {
    public static void main(String[] args) {

        // 创建
        Book book = new Book();
        book.setTitle("红楼梦");
        book.setAuthor("曹雪芹");
        book.setPrice(99.9);
        System.out.println(book);

        Book b2 = new Book("西游记", "吴承恩1", 88.8);
        b2.setAuthor("吴承恩");
        System.out.println(b2);
    }
}
