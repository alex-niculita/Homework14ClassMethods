package pro.sky.lesson14;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Mark","Twain");
        Author author2 = new Author("Jerome David","Salinger");
        Author author3 = new Author("George","Orwell");
        Author author4 = new Author("Mark","Orwell");

        Book book1 = new Book("Huckleberry Finn", author1, 1884);
        Book book2 = new Book("Catcher in the Rye", author2, 1951);
        Book book3 = new Book("Animal Farm", author3, 1945);

        book2.setYear(1835);

        System.out.println(book1);

        System.out.println(book2);

        System.out.println(book3);

    }
}