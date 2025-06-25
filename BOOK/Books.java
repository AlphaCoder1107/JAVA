/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package BOOK;
import java.util.*;
public class Books{
    String tittle;
    String author;
    String isbn;
    static int noOfBooksInLibrary;

    public void borrowBooks(){
        if (noOfBooksInLibrary <= 0) {
            System.out.println("No books available to borrow.");
        } else {
            noOfBooksInLibrary--;
            System.out.println("You have borrowed a book. Books left: " + noOfBooksInLibrary);
        }
        
    }

    public void returnBooks(){
        noOfBooksInLibrary++;
        System.out.println("You have returned a book. Books available: " + noOfBooksInLibrary);
    }


    


    

}