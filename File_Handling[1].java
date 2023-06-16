
package librarymanagementsystem;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class File_Handling {
    public void storeDatabase()
    {
         try (FileOutputStream fos = new FileOutputStream("librarian.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(LibraryManagementSystem.librarians);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (FileOutputStream fos = new FileOutputStream("borrower.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(LibraryManagementSystem.borrowers);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (FileOutputStream fos = new FileOutputStream("clerk.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(LibraryManagementSystem.clerks);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (FileOutputStream fos = new FileOutputStream("book.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(LibraryManagementSystem.books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadDatabase()
    {
        try (FileInputStream fis = new FileInputStream("librarian.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Librarian> librarianList = (ArrayList<Librarian>) ois.readObject();
            
            LibraryManagementSystem.librarians.addAll(librarianList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try (FileInputStream fis = new FileInputStream("borrower.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Borrower> borrowerList = (ArrayList<Borrower>) ois.readObject();
            
            LibraryManagementSystem.borrowers.addAll(borrowerList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try (FileInputStream fis = new FileInputStream("clerk.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Clerk> clerkList = (ArrayList<Clerk>) ois.readObject();
            
            LibraryManagementSystem.clerks.addAll(clerkList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try (FileInputStream fis = new FileInputStream("book.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            ArrayList<Book> bookList = (ArrayList<Book>) ois.readObject();
            
            LibraryManagementSystem.books.addAll(bookList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
