package com.hainiu.oop1;

// 用于描述书籍信息
/*
成员变量 -- 属性 -- field 字段
成员方法 -- 行为 -- method
构造方法 -- 创建对象 -- constructor  构造器

私有成员变量
提供相应的get和set方法
提供构造器（无参数 全参数）
 */
public class Book {

    private String title;
    private String author;
    private double price;

    // alt + insert -- 调出一个生成代码的菜单

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 对象如何转换成字符串
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
