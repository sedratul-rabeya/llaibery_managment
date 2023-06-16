
package librarymanagementsystem;

/**
 *
 * @author Rafi
 */
import java.io.Serializable;
import java.util.*;
public class Clerk extends User implements Serializable{
    private List<Book> issuedBooks = new ArrayList<>();
    private ArrayList<Borrower> borrowers;
    private ArrayList<Transaction> transactions;
    private double payment;
    public Clerk(String username, 
                String password,String usertype, 
                String phnNo, 
                String uniqueID, 
                String mothersName, 
                String fathersName, 
                String bloodGroup, 
                String religion, 
                String emailID, 
                String nationality,double payment) throws IllegalPasswordException {
    super(username, 
                password,"Admin", 
                phnNo, 
                uniqueID, 
                mothersName, 
                fathersName, 
                bloodGroup, 
                religion, 
                emailID, 
                nationality);
        transactions = new ArrayList<>();
        this.payment = payment;
        
    }
    public void setBorrowers(ArrayList<Borrower> borrowers) {
    this.borrowers = borrowers; 
}

public ArrayList<Borrower> getBorrowers() {
    return borrowers; 
}
    public void addBorrower(Borrower borrower) {
    borrowers.add(borrower); 
}

    public void removeBorrower(String borrowerName) {
       for (Borrower borrower : borrowers) {
            if (borrower.getUsername().equals(borrowerName)) {
            borrowers.remove(borrower); 
            break; 
        }
    }
    
  }
    public int getTotalBorrowers() {
    return borrowers.size(); 
}

   public void addIssuedBook(String borrowerUsername, String bookTitle, double issueFine, double overdueFine) {
Transaction transaction = new Transaction(borrowerUsername, bookTitle, issueFine, overdueFine);
transactions.add(transaction);
}

    public void returnBook(Book book) {
        if (!issuedBooks.contains(book)) {
            System.out.println("The book is not issued to you.");
            return;
        }
        issuedBooks.remove(book);
        book.setAvailableCopies(book.getAvailableCopies() + 1);
        System.out.println("The book has been returned.");
    }
@Override 
public void display() { 
    System.out.println("Clerk details: "); 
    super.display(); 
    System.out.println("Borrowers: "); 
    for (Borrower borrower : borrowers) { 
        System.out.println(borrower.getUsername() + ": "); 
        borrower.display(); 
    }

}
}