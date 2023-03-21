package edu.usts.mqk07_encapsulation.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/19 15:20
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bn) {
        bookName = bn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String au) {
        author = au;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public String showInfo() {
        return "bookName:" + bookName + ", author:" + author + ", price:" + price;
    }
}
