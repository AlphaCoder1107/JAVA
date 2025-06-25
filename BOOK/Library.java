/**
 * Author   : AlphaCoder1107
 * GitHub   : https://github.com/AlphaCoder1107
 * Created  : 2025-06-25
 * Purpose  : 
 * License  : MIT License
 */

package BOOK;

public class Library {
    

    public static void main(String[] args){
        Books book1 = new Books();
        book1.tittle = "The Great Gatsby";
        book1.author = "F. Scott Fitzgerald";
        book1.isbn = "9780743273565";
        Books.noOfBooksInLibrary = 10;

        System.out.println("Welcome to the Library!");
        System.out.println("Available books: " + Books.noOfBooksInLibrary);
        
        book1.borrowBooks();
        book1.returnBooks();
    }
}
