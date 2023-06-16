
package librarymanagementsystem;
import java.io.*;
/**
 *
 * @author Rafi
 */
import java.util.*;
public class Admin extends User implements Serializable{
    String username;
String password;
private String phnNo;
private String uniqueID;
private String mothersName;
private String fathersName;
private String bloodGroup;
private String religion;
private String emailID;
private String nationality;
private double payment;
private ArrayList<Librarian> librarians;
private ArrayList<Clerk> clerks;
private ArrayList<Book> books;
private ArrayList<Borrower> borrowers;
public Admin(String username, 
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
    
    librarians = new ArrayList<>(); 
    clerks = new ArrayList<>(); 
    books = new ArrayList<>(); 
    borrowers = new ArrayList<>(); 
    // Initialize the private variables
    this.payment = payment;
}
public String getUniqueID() {
    return uniqueID;
}

// Add a method to get the name of the admin
public String getUserName() {
    return username;
}

// Add a method to get the email address of the admin
public String getEmailAddress() {
    return emailID;
}

// Add a method to get the phone number of the admin
public String getPhoneNumber() {
    return phnNo;
}

// Add a method to get the fathers name of the admin
public String getFathersName() {
    return fathersName;
}

// Add a method to get the mothers name of the admin
public String getMothersName() {
    return mothersName;
}

// Add a method to get the nationality of the admin
public String getNationality() {
    return nationality;
}
public void addLibrarian(Librarian librarian) {
    librarians.add(librarian); 
}

public void removeLibrarian(Librarian librarian) {
    librarians.remove(librarian); 
}

public void addClerk(Clerk clerk) {
    clerks.add(clerk); 
}

public void removeClerk(Clerk clerk) {
    clerks.remove(clerk); 
}

public void addBook(Book book) {
    books.add(book); 
}

public void removeBook(Book book) {
    books.remove(book); 
}

public void updateBook(Book book) {
    //Update book information 
}

public void viewLibrarians() {
    for (Librarian librarian : librarians) {
        librarian.display(); 
    } 
}

public void viewClerks() {
    for (Clerk clerk : clerks) {
        clerk.display(); 
    } 
}

public void viewBooks() {
    for (Book book : books) {
        book.display(); 
    } 
}

public void viewBorrowers() {
    for (Borrower borrower : borrowers) {
        borrower.display(); 
    } 
}

@Override
public void display() {
    System.out.println("Admin details: ");
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
    System.out.println("Phone number: " + phnNo);
    System.out.println("Unique ID: " + uniqueID);
    System.out.println("Mother's name: " + mothersName);
    System.out.println("Father's name: " + fathersName);
    System.out.println("Blood group: " + bloodGroup);
    System.out.println("Religion: " + religion);
    System.out.println("Email ID: " + emailID);
    System.out.println("Nationality: " + nationality);
    System.out.println("Payment: " + payment);
}
}