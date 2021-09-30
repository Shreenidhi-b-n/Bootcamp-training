package mainUiPack;

import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStoreMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



        while(true){
            System.out.println("1.Add Book");
            System.out.println("2.List all the books");
            System.out.println("");
            System.out.println("");
            System.out.println("5.Exit");

            System.out.println("Enter your choice");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                {
                    System.out.println("Enter the details of books");
                    int bookId=sc.nextInt();
                    String bookName=sc.nextLine();
                    int bookPrice=sc.nextInt();
                    break;
                }
                case 2:
                {
                    ArrayList<Book> blist;
                }
                case 3:
                {
                    System.out.println("Enter the book id to be searched");
                    int bookId=sc.nextInt();
                    System.out.println("Enter updated price");

                }

            }
        }
    }
}
