package edu.usts.mqk07_encapsulation.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/19 15:30
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookName("《三体》");
        book1.setAuthor("刘慈欣");
        book1.setPrice(30.0);
        System.out.println(book1.showInfo());
    }
}
