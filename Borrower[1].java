package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Borrower extends User {

    private String borrowerId;
    private String phnNo;
    private List<Book> issuedBooks = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    private String uniqueID;
    private String mothersName;
    private String fathersName;
    private String bloodGroup;
    private String religion;
    private String emailID;

    public Borrower(String username, 
                String password,String usertype, 
                String phnNo, 
                String uniqueID, 
                String mothersName, 
                String fathersName, 
                String bloodGroup, 
                String religion, 
                String emailID, 
                String nationality) throws IllegalPasswordException {
    super(username, 
                password,"Borrower", 
                phnNo, 
                uniqueID, 
                mothersName, 
                fathersName, 
                bloodGroup, 
                religion, 
                emailID, 
                nationality);
        this.phnNo = phnNo;
        this.uniqueID = uniqueID;
        this.mothersName = mothersName;
        this.fathersName = fathersName;
        this.bloodGroup = bloodGroup;
        this.religion = religion;
        this.emailID = emailID;
    }

    public void addIssuedBook(Book book) {
        if (issuedBooks.contains(book)) {
            System.out.println("The book is already issued to you.");
            return;
        }
        issuedBooks.add(book);
        book.setAvailableCopies(book.getAvailableCopies() - 1);
        System.out.println("The book has been issued.");
    }

 public void returnBook(String title) {
    // Find the book with the given title.
    Book book = null;
    for (Book b : issuedBooks) {
        if (b.getBookTitle().equals(title)) {
            book = b;
            break;
        }
    }

    // Check if the book was found.
    if (book == null) {
        System.out.println("The book with title " + title + " was not found.");
        return;
    }

    // Check if the book is issued to the borrower.
    if (!issuedBooks.contains(book)) {
        System.out.println("The book with title " + title + " is not issued to you.");
        return;
    }

    // Remove the book from the issued books list.
    issuedBooks.remove(book);

    // Increase the number of available copies of the book.
    book.setAvailableCopies(book.getAvailableCopies() + 1);

    // Print a message that the book has been returned.
    System.out.println("The book with title " + title + " has been returned.");
}

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }
@Override
    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
@Override
    public String getMothersName() {
        return mothersName;
    }
@Override
    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }
@Override
    public String getFathersName() {
        return fathersName;
    }
@Override
    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
@Override
    public String getBloodGroup() {
        return bloodGroup;
    }
@Override
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
@Override
    public String getReligion() {
        return religion;
    }
@Override
    public void setReligion(String religion) {
        this.religion = religion;
    }
@Override
    public String getEmailID() {
        return emailID;
    }
@Override
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }


    @Override
    public void display() {
        System.out.println("Borrower details: ");
        System.out.println("Id: " + borrowerId);
        System.out.println("Name: " + username);
        System.out.println("Unique ID: " + uniqueID);
        System.out.println("Mother's name: " + mothersName);
        System.out.println("Father's name: " + fathersName);
        System.out.println("Blood group: " + bloodGroup);
        System.out.println("Religion: " + religion);
        System.out.println("Email ID: " + emailID);
        
    }
    public void viewTransactions() {
    System.out.println("Transactions: ");
    for (Transaction transaction : transactions) {
        System.out.println("Transaction ID: " + transaction.getTransactionId());
        System.out.println("Borrower Username: " + transaction.getBorrowerUsername());
        System.out.println("Book Title: " + transaction.getBookTitle());
        System.out.println("Issue Fine: " + transaction.getIssueFine());
        System.out.println("Overdue Fine: " + transaction.getOverdueFine());
        System.out.println("Damaged Fine: " + transaction.getDamagedFine());
        System.out.println("Transaction Date: " + transaction.getTransactionDate());
    }
}


    public void displayBooks() {
        System.out.println("Issued books: ");
        for (Book book : issuedBooks) {
            System.out.println(book.getBookTitle());
        }
    }
}
