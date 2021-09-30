package bookop;

import model.Book;

import java.sql.*;
import java.util.ArrayList;

public class BookOperationImpl  implements BookOperations {

    private static Connection con=null;
    @Override
    public String addABook(Book book) {
        con=DBManager.getConnection();
        PreparedStatement ps=null;
        String s="insert into book values(?,?,?)";
        try {
            ps=con.prepareStatement(s);
            ps.setInt(1,book.getBookId());
            ps.setString(2,book.getBookName());
            ps.setInt(3,book.getBookPrice());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Book Added successfully!!!";
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> blist=new ArrayList<Book>();
        con=DBManager.getConnection();

        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from book");
            while(rs.next()){
                blist.add(new Book(rs.getInt(1),rs.getString(2),rs.getInt(3)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return blist;
    }

    @Override
    public Book getABook(int bookId) {
        con = DBManager.getConnection();
        Book book=null;
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from book where bookId="+bookId);
            while(rs.next())
            {
                book = new Book(rs.getInt(1),rs.getString(2),rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public String setBookPrice(int bookId, int upPrice) {

        PreparedStatement ps = null;
        String str = "update book set bookPrice = ? where bookId=?";

        con = DBManager.getConnection();
        try {
            ps = con.prepareStatement(str);
            ps.setInt(1,upPrice);
            ps.setInt(2,bookId);

            ps.executeUpdate();

            return "Book price updated successfully..";

        } catch (SQLException e) {
            //e.printStackTrace();
            return ("Updation failed....");
        }
    }

    @Override
    public String deleteBook(int bookId) {
        PreparedStatement ps = null;
        String s = "delete from book where bookId=?";

        con = DBManager.getConnection();
        try {
            ps = con.prepareStatement(s);
            ps.setInt(1,bookId);

            ps.executeUpdate();

            return "Book was deleted successfully!!!";

        } catch (SQLException e) {
            //e.printStackTrace();
            return ("Deletion failed....");
        }
    }
}
