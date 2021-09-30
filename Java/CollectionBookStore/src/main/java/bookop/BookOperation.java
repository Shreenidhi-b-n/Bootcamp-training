package bookop;

import model.Book;

import java.util.ArrayList;

public interface BookOperation {
    String addBook(Book b);
    ArrayList<Book> getAllBook();
    Book getBook(int bookId);
    String setBookPrice(int upPrice);


}
