
package librarymanagementsystem;
import java.util.*;
import java.io.*;
public class Book implements Serializable{
    private String bookTitle;
    private String author;
    private String ISBN;
    private Date publicationDate;
    private ArrayList<Borrower> borrowers = new ArrayList<>();
    private int availableCopies,totalCopies;

    public Book() {
        
    }
      // Getters
    public Book(String bktitle, String auth, String isbn,int totalcopy) throws illegalSBNException{
        
           
        if(!illegalSBNException.isValidISBN(isbn) ){
            
            throw new illegalSBNException("You should only enter intger values with 13 digits. ");
        } else {
        
        bookTitle = bktitle;
        author = auth;
        ISBN = isbn;
        totalCopies = totalcopy;
        availableCopies = totalcopy;
        }
        //publicationDate = pb;
        
    }
    
    public String getBookTitle(){
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }
  

    // Setters

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
        public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }

    public ArrayList<Borrower> getBorrowers() {
        return borrowers;
    }
    public void setAvailableCopies(int availableCopies) { 
        this.availableCopies = availableCopies; 
    } 

    public int getAvailableCopies() { 
        return availableCopies; 
    } 

    public void setTotalCopies(int totalCopies) { 
        this.totalCopies = totalCopies; 
    } 

    public int getTotalCopies() { 
        return totalCopies; 
    } 
  
    // Display method

    public void display() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
      //  System.out.println("Publication Date: " + publicationDate);
        
    }
}
