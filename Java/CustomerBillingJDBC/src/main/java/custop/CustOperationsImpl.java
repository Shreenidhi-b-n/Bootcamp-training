package custop;

import bookop.DBManager;
import model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CustOperationsImpl implements CustOperations{
    private static int count=1;
    private final int tid;
    private ArrayList<Book> slist=new ArrayList<Book>();
    private Map<Integer,Integer> smap=new HashMap<Integer,Integer>();
    Random r=new Random();
    private static Connection con=null;

    public CustOperationsImpl(){
        this.tid=r.nextInt(80000)+26198;
    }

    public int getTid(){
        return tid;
    }

    @Override
    public void addToCart(Book b, int qt) {
        slist.add(b);
        smap.put(b.getBookId(),b.getBookPrice()*qt);
    }

    public void getBill(String name){
        con= DBManager.getConnection();
        PreparedStatement ps=null;
        int tamt=0;
        for(Integer i:smap.keySet())
            tamt+=smap.get(i);
        String s="insert into Transaction values(?,?,?)";
        try {
            ps=con.prepareStatement(s);
            ps.setInt(1,getTid());
            ps.setString(2,name);
            ps.setInt(3,tamt);
            ps.executeUpdate();
            System.out.println("Transaction Id: "+getTid()+" Bill Amount is: "+tamt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
