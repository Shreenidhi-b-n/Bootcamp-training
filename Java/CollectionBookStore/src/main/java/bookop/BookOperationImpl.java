package bookop;

import model.Book;

import java.util.ArrayList;

public class BookOperationImpl implements BookOperation{

    private ArrayList<Book> blist=new ArrayList<Book>();

    @Override
    public String addBook(Book b) {
        blist.add(b);
        return "Book added successfully";
    }

    @Override
    public ArrayList<Book> getAllBook() {
        return blist;
    }

    @Override
    public Book getBook(int bookId) {
        for(Book b:blist){
            return b;
        }
    }

    @Override
    public String setBookPrice(int upPrice) {
        return null;
    }


}
