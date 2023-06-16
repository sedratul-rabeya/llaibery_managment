
package librarymanagementsystem;



import java.io.Serializable;
import java.util.*;

public class Librarian extends User implements Serializable{
    private ArrayList<Book> bookList;
    private ArrayList<Clerk> clerks;
    private double payment ;

    public Librarian(String username, 
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
                password,"Librarian", 
                phnNo, 
                uniqueID, 
                mothersName, 
                fathersName, 
                bloodGroup, 
                religion, 
                emailID, 
                nationality);
        this.payment = payment;
        bookList = new ArrayList<>();
        clerks = new ArrayList<>();
    }
    public void setBookList(ArrayList<Book> bookList) {
    this.bookList = bookList; 
}

public ArrayList<Book> getBookList() {
    return bookList; 
}

public void setClerks(ArrayList<Clerk> clerks) {
    this.clerks = clerks; 
}

public ArrayList<Clerk> getClerks() {
    return clerks; 
}

public void addBook(Book book) {
    bookList.add(book); 
}

public void removeBook(Book book) {
    bookList.remove(book); 
}
public double getPayment(){
    return payment;
}
public void setPayment(double payment){
    this.payment = payment;
}

 

   
@Override
    // Getter for username
    public String getUsername() {
        return username;
    }
@Override
    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }
@Override
    // Getter for password
    public String getPassword() {
        return password;
    }
@Override
    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
@Override
    // Display method
    public void display() {
        System.out.println("Librarian:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
       
    }
    public void printBookTitles() {
    for (Book b : bookList) {
        System.out.println(b.getBookTitle());
    }
}
    public void addClerk(Clerk clerk) {
    clerks.add(clerk); 
} 

public void removeClerk(String clerkName) {
    for (Clerk c : clerks) {
        if (c.getUsername().equals(clerkName)) {
            clerks.remove(c); 
            break; 
        }
    }
}

public void displayBookList() {
    super.display(); 
    System.out.println("Number of books: " + bookList.size()); 
    System.out.println("Number of clerks: " + clerks.size()); 
}
}
