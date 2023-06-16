package librarymanagementsystem;

import java.util.*;
public class LibraryManagementSystem {
        public static    ArrayList<Admin> admins = new ArrayList<>();
        public static ArrayList<Librarian> librarians = new ArrayList<>();
        public static ArrayList<Borrower> borrowers = new ArrayList<>();
        
        public static ArrayList<Clerk> clerks = new ArrayList<>();
        public static ArrayList<Book> books = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);

        try{
            
           
            Admin a1 = new Admin("username", "password", "usertype", "phnNo", "1234", "mothersName", "fathersName", "0", "religion", "emailID", "bd", 1000.0);

            admins.add(a1);
         
        
        //ArrayList<Borrower> borrower = new ArrayList<>();
        System.out.println("====================");
        System.out.println("WELLCOME OUR LAIBERY");
        System.out.println("====================");
        
        }
        catch(IllegalPasswordException e){
            System.out.println(e.getMessage());
        }
        mainlibraryloop:while(true){ //mainlibraryloop starts
            System.out.println("Welcome to our Library ");
            System.out.println(" 1 -- Login");
            System.out.println(" 2 -- View List of Books");
            int option1 = input.nextInt();
            switch(option1){ //login and view books
                case 1 : {
                
                    System.out.println("Enter usertype: ");
                    System.out.println("1 - Admin");
                    System.out.println("2 - Librarian");
                    System.out.println("3 - Clerk");
                    System.out.println("4 - Borrower");
                    System.out.println("5 - Back");
                    int loginOption = input.nextInt();
                    switch(loginOption){//log for admin lib cler borr back
                        case 1:{ //Admin function starts with this
                        
                            
                            System.out.println("Enter username: ");
                            String usernameAdmin = input.next();
                            System.out.println("Enter password  ");
                            String passwordAdmin = input.next();
                            
                            adminfunctionloop:while(true){ //adminFunction while after switch 1
                                System.out.println("Admin portal");
                                System.out.println("");
                                System.out.println("Following functionalities are available ");
                                System.out.println("1 -- add a Librarian");
                                System.out.println("2 -- add a borrower");
                                System.out.println("3 -- add a clerk");
                                System.out.println("4 -- add a Book");
                                System.out.println("5 -- Display option");
                                System.out.println("6 -- Back");


                                    int adminInputOption = input.nextInt();
                                    switch(adminInputOption){
                                        case 1:{//adminInputOption create libra

                                            try{
                                                System.out.println("Enter your username: ");
                                                String username = input.nextLine();

                                                System.out.println("Enter your password: ");
                                                String password = input.nextLine();

                                                System.out.println("Enter your user type: ");
                                                String usertype = input.nextLine();

                                                System.out.println("Enter your phone number: ");
                                                String phnNo = input.nextLine();

                                                System.out.println("Enter your unique ID: ");
                                                String uniqueID = input.nextLine();

                                                System.out.println("Enter your mother's name: ");
                                                String mothersName = input.nextLine();

                                                System.out.println("Enter your father's name: ");
                                                String fathersName = input.nextLine();

                                                System.out.println("Enter your blood group: ");
                                                String bloodGroup = input.nextLine();

                                                System.out.println("Enter your religion: ");
                                                String religion = input.nextLine();

                                                System.out.println("Enter your email ID: ");
                                                String emailID = input.nextLine();

                                                System.out.println("Enter your nationality: ");
                                                String nationality = input.nextLine();

                                                System.out.println("Enter your payment: ");
                                                double payment = input.nextDouble();

                                                // Create a Librarian object
                                                Librarian librarian = new Librarian(username, password, usertype, phnNo, uniqueID, mothersName, fathersName, bloodGroup, religion, emailID, nationality,payment);

                                                // Add the Librarian object to the ArrayList

                                                librarians.add(librarian);
                                                break;
                                            }catch (IllegalPasswordException e) {
                                              System.out.println("Invalid password.");
                                            }


                                        }


                                        case 2:{ //borrow create adminInputOption
                                            System.out.println("Enter your username: ");
                                            String username = input.nextLine();

                                            System.out.println("Enter your password: ");
                                            String password = input.nextLine();

                                            System.out.println("Enter your user type: ");
                                            String usertype = input.nextLine();

                                            System.out.println("Enter your phone number: ");
                                            String phnNo = input.nextLine();

                                            System.out.println("Enter your unique ID: ");
                                            String uniqueID = input.nextLine();

                                            System.out.println("Enter your mother's name: ");
                                            String mothersName = input.nextLine();

                                            System.out.println("Enter your father's name: ");
                                            String fathersName = input.nextLine();

                                            System.out.println("Enter your blood group: ");
                                            String bloodGroup = input.nextLine();

                                            System.out.println("Enter your religion: ");
                                            String religion = input.nextLine();

                                            System.out.println("Enter your email ID: ");
                                            String emailID = input.nextLine();

                                            System.out.println("Enter your nationality: ");
                                            String nationality = input.nextLine();

                                            // Create a Borrower object adminInputOption
                                            try {
                                              Borrower borrower = new Borrower(username, password, usertype, phnNo, uniqueID, mothersName, fathersName, bloodGroup, religion, emailID, nationality);

                                              // Add the Borrower object to the ArrayList

                                              borrowers.add(borrower);
                                            }catch (IllegalPasswordException e) {
                                              System.out.println("Invalid password.");
                                            }

                                        }// case create borrower ends


                                        case 3:{ // create clerk adminInputOption
                                            System.out.println("Enter your username: ");
                                            String username = input.nextLine();

                                            System.out.println("Enter your password: ");
                                            String password = input.nextLine();

                                            System.out.println("Enter your user type: ");
                                            String usertype = input.nextLine();

                                            System.out.println("Enter your phone number: ");
                                            String phnNo = input.nextLine();

                                            System.out.println("Enter your unique ID: ");
                                            String uniqueID = input.nextLine();

                                            System.out.println("Enter your mother's name: ");
                                            String mothersName = input.nextLine();

                                            System.out.println("Enter your father's name: ");
                                            String fathersName = input.nextLine();

                                            System.out.println("Enter your blood group: ");
                                            String bloodGroup = input.nextLine();

                                            System.out.println("Enter your religion: ");
                                            String religion = input.nextLine();

                                            System.out.println("Enter your email ID: ");
                                            String emailID = input.nextLine();

                                            System.out.println("Enter your nationality: ");
                                            String nationality = input.nextLine();
                                            System.out.println("Enter the payment: ");
                                            double payment = input.nextDouble();

                                            // Create a Borrower object
                                            try {
                                              Clerk clerk = new Clerk(username, password, usertype, phnNo, uniqueID, mothersName, fathersName, bloodGroup, religion, emailID, nationality,payment);

                                              // Add the Borrower object to the ArrayList

                                              clerks.add(clerk);
                                            }catch (IllegalPasswordException e) {
                                              System.out.println("Invalid password.");
                                            }

                                        } //create clerk ends

                                        case 4 :{//add book adminInputOption
                                            try {
                                            // Get the bktitle, auth, isbn, and totalcopy from the user.
                                            System.out.println("Enter the bktitle: ");
                                            String bktitle = input.nextLine();

                                            System.out.println("Enter the auth: ");
                                            String auth = input.nextLine();

                                            System.out.println("Enter the isbn: ");
                                            String isbn = input.nextLine();

                                            System.out.println("Enter the totalcopy: ");
                                            int totalcopy = input.nextInt();

                                            // Create a new Book object with the given information.
                                            Book book = new Book(bktitle, auth, isbn, totalcopy);

                                            // Add the Book object to the ArrayList.
                                            books.add(book);

                                            } catch (illegalSBNException e) {
                                            // Print an error message if the ISBN is invalid.
                                            System.out.println("Invalid ISBN.");
                                            }

                                        } //addBook adminInputOption ends

                                        case 5:{// adminInputOption display function starts


                                            adminDisplayLoop:while(true){ //adminDisplayLoop:while(true) starts

                                                System.out.println("1 -- Display list of librarians ");
                                                System.out.println("2 -- Display list of clerks ");
                                                System.out.println("3 -- Display list of borrower ");
                                                System.out.println("4 -- Display list of book ");
                                                System.out.println("5 -- Back");
                                                int inputDisplayAdmin = input.nextInt();
                                                switch(inputDisplayAdmin){
                                                    case 1:{ //inputDisplayAdmin
                                                         System.out.println("print all librarian information:");
                                                         for(int i=0;i<librarians.size();i++){

                                                         librarians.get(i).display();
                                                         }
                                                         break;
                                                    }
                                                    case 2:{//inputDisplayAdmin
                                                        System.out.println("printing list of all clerk");
                                                        for(int i=0;i<clerks.size();i++){
                                                        System.out.println("("+(i+1)+")"+clerks.get(i).getUsername());
                                                        }
                                                        break;
                                                    }
                                                    case 3:{//inputDisplayAdmin
                                                        System.out.println("print all borrower information:");
                                                        for(int i=0;i<borrowers.size();i++){
                                                        System.out.println((i+1)+" "+borrowers.get(i).getUsername());
                                                        }
                                                    break;

                                                    }
                                                    case 4:{//inputDisplayAdmin
                                                        System.out.println("Displaying book list");

                                                        for(int i=0;i<books.size();i++){
                                                        System.out.println((i+1)+" ");
                                                        books.get(i).display();
                                                        }
                                                        break;
                                                    }
                                                    case 5:{//inputDisplayAdmin
                                                        break adminDisplayLoop;
                                                    } //case 5 inputDisplayAdmin ends
                                                }//switch(inputDisplayAdmin) ends      

                                            }//adminDisplayLoop:while(true) ends


                                        }//case 5  adminInputOption ends



                                        
                                    }//switch(adminInputOption)
                            }//while after switch 1 ends
                        }//adminfunction ends
                            
                       
             
                        
                        
                        case 2:{ // Librarian function starts
                            System.out.println("Enter the username: ");
                            String username = input.nextLine();

                            System.out.println("Enter the password: ");
                            String password = input.nextLine();

                            // Check if the username and password exist in the ArrayList.
                            boolean found = false;
                            for (Librarian librarian : librarians) {
                            if (librarian.getUsername().equals(username) && librarian.getPassword().equals(password)) {
                            found = true;
                            break;
                            }
                            }

                            // If the user is not found, print "user not found".
                            if (!found) {
                            System.out.println("User not found.");
                            }
                            while (true) {
                            System.out.println("Welcome to the Librarian Menu");
                            System.out.println("What would you like to do?");
                            System.out.println("1. Add a book");
                            System.out.println("2. Remove a book");
                            System.out.println("3. List of all books");
                            System.out.println("4. Add a clerk");
                            System.out.println("5. Remove a clerk");
                            System.out.println("6. List of all clerks");
                            System.out.println("7. Back");

                            int optionLibrarian = input.nextInt();

                            switch (optionLibrarian) { ////optionLibrarian switch starts
                                case 1:{ //optionLibrarian case 1 starts
                                    
                                        try {
                                            // Get the bktitle, auth, isbn, and totalcopy from the user.
                                            System.out.println("Enter the bktitle: ");
                                            String bktitle = input.nextLine();

                                            System.out.println("Enter the auth: ");
                                            String auth = input.nextLine();

                                            System.out.println("Enter the isbn: ");
                                            String isbn = input.nextLine();

                                            System.out.println("Enter the totalcopy: ");
                                            int totalcopy = input.nextInt();

                                            // Create a new Book object with the given information.
                                            Book book = new Book(bktitle, auth, isbn, totalcopy);

                                            // Add the Book object to the ArrayList.
                                            books.add(book);

                                            } catch (illegalSBNException e) {
                                            // Print an error message if the ISBN is invalid.
                                            System.out.println("Invalid ISBN.");
                                            }
                                    
                                } //optionLibrarian case 1 ends
                                
                                case 2: {
                                    System.out.println("Enter the book title: ");
                                    String bookTitlein = input.nextLine();

                                    // Check if the unique ID exists in the ArrayList.
                                    boolean found2 = false;
                                    for (Book book : books) {
                                        if (book.getBookTitle().equals(bookTitlein)) {
                                            found2 = true;
                                            books.remove(book);
                                            break;
                                        }
                                    }

                                    // If the book is not found, print "book does not exist".
                                    if (!found2) {
                                        System.out.println("Book does not exist.");
                                    }
                                    break;
                                }
                                case 3:{//inputDisplayAdmin
                                                        System.out.println("Displaying book list");

                                                        for(int i=0;i<books.size();i++){
                                                        System.out.println((i+1)+" ");
                                                        books.get(i).display();
                                                        }
                                                        break;
                                                    }
                                
                                    
                                case 4:{ // create clerk starts in librarian
                                            System.out.println("Enter your username: ");
                                            String user1name = input.nextLine();

                                            System.out.println("Enter your password: ");
                                            String password1 = input.nextLine();

                                            System.out.println("Enter your user type: ");
                                            String usertype = input.nextLine();

                                            System.out.println("Enter your phone number: ");
                                            String phnNo = input.nextLine();

                                            System.out.println("Enter your unique ID: ");
                                            String uniqueID = input.nextLine();

                                            System.out.println("Enter your mother's name: ");
                                            String mothersName = input.nextLine();

                                            System.out.println("Enter your father's name: ");
                                            String fathersName = input.nextLine();

                                            System.out.println("Enter your blood group: ");
                                            String bloodGroup = input.nextLine();

                                            System.out.println("Enter your religion: ");
                                            String religion = input.nextLine();

                                            System.out.println("Enter your email ID: ");
                                            String emailID = input.nextLine();

                                            System.out.println("Enter your nationality: ");
                                            String nationality = input.nextLine();
                                            System.out.println("Enter the payment: ");
                                            double payment = input.nextDouble();

                                            // Create a Borrower object
                                            try {
                                              Clerk clerk = new Clerk(user1name, password1, usertype, phnNo, uniqueID, mothersName, fathersName, bloodGroup, religion, emailID, nationality,payment);

                                              // Add the Borrower object to the ArrayList

                                              clerks.add(clerk);
                                            }catch (IllegalPasswordException e) {
                                              System.out.println("Invalid password.");
                                            }

                                        } //create clerk ends case 4
                                case 5:{
                                    
                                     // Remove a clerk.
                                    System.out.println("Enter the clerk's username to remove: ");
                                    String clerkUsername = input.nextLine();

                                    for (Clerk clerk : clerks) {
                                        if (clerk.getUsername().equals(clerkUsername)) {
                                            clerks.remove(clerk);
                                            break;
                                        }
                                    }
                                    break;
                                    
                                    
                                }
                                    
                                case 6:{
                                    // Display the clerks.
                                    for (int i = 0;clerks.size()>i ;i++) {
                                        clerks.get(i).display();
                                    }
                                    break;
                                }
                                case 7:{
                                    break;
                                }
                            }
                            }
                            }
                    
                      /*  case 3:{//Clerk functions of login starts
                            while (true) {
                                System.out.println("Enter the username: ");
                                String username = input.nextLine();

                                System.out.println("Enter the password: ");
                                String password = input.nextLine();

                                // Check if the username and password exist in the ArrayList.
                                 boolean found = false;
                                for (int i = 0; i < clerks.size(); i++) {
                                    if (clerks.get(i).getUsername().equals(username) && clerks.get(i).getPassword().equals(password)) {
                                        found = true;
                                        break;
                                    }
                                }

                                // If the clerk is not found, print "clerk not found".
                                if (!found) {
                                    System.out.println("Clerk not found.");
                                }else {
                                    System.out.println("Welcome to the Clerk Menu");
                                    System.out.println("What would you like to do?");
                                    System.out.println("1. View issued books");
                                    

                                    System.out.println("2. Add a borrower");
                                    System.out.println("3. Remove a borrower");
                                    System.out.println("4. View borrowers");
                                    System.out.println("7. Add issued book");
                                    System.out.println("8. Remove issued book");

                                    System.out.println("8. Pay fines");
                                    System.out.println("9. Back");

                                    int option = input.nextInt();


                                 switch (option) {
                                    case 1:
                                        for (Book book : books) {
                                    if (book.getAvailableCopies() != book.getTotalCopies()) {
                                        System.out.println(book.getBookTitle());
                                    }
                                }
                                break;
                                   
                                    
                                    case 2:
                                         System.out.println("Enter your username: ");
                                            String username123 = input.nextLine();

                                            System.out.println("Enter your password: ");
                                            String password123 = input.nextLine();

                                            System.out.println("Enter your user type: ");
                                            String usertype = input.nextLine();

                                            System.out.println("Enter your phone number: ");
                                            String phnNo = input.nextLine();

                                            System.out.println("Enter your unique ID: ");
                                            String uniqueID = input.nextLine();

                                            System.out.println("Enter your mother's name: ");
                                            String mothersName = input.nextLine();

                                            System.out.println("Enter your father's name: ");
                                            String fathersName = input.nextLine();

                                            System.out.println("Enter your blood group: ");
                                            String bloodGroup = input.nextLine();

                                            System.out.println("Enter your religion: ");
                                            String religion = input.nextLine();

                                            System.out.println("Enter your email ID: ");
                                            String emailID = input.nextLine();

                                            System.out.println("Enter your nationality: ");
                                            String nationality = input.nextLine();

                                            // Create a Borrower object adminInputOption
                                            try {
                                              Borrower borrower = new Borrower(username123, password123, usertype, phnNo, uniqueID, mothersName, fathersName, bloodGroup, religion, emailID, nationality);

                                              // Add the Borrower object to the ArrayList

                                              borrowers.add(borrower);
                                            }catch (IllegalPasswordException e) {
                                              System.out.println("Invalid password.");
                                            }
                                        break;
                                    case 5:
                                        System.out.println("Enter the borrower's username:");
                                        String username1234 = input.nextLine();

                                        // Find the borrower with the given username.
                                        Borrower borrower1 = null;
                                        for (Borrower b : borrowers) {
                                            if (b.getUsername().equals(username1234)) {
                                                borrower1 = b;
                                                break;
                                            }
                                        }

                                        // Check if the borrower was found.
                                        if (borrower1 == null) {
                                            System.out.println("Borrower not found.");
                                            return;
                                        }else{

                                        // Remove the borrower from the list of borrowers.
                                        borrowers.remove(borrower1);

                                        // Print a message that the borrower has been removed.
                                        System.out.println("The borrower has been removed.");
                                 }
                                        break;
                                    case 6:
                                        System.out.println("print all borrower information:");
                                                        for(int i=0;i<borrowers.size();i++){
                                                        System.out.println((i+1)+" "+borrowers.get(i).getUsername());
                                        break;
                                                        }
                                    case 7:
                                        
                                        System.out.println("Enter the book title:");
                                        String bookTitle = input.nextLine();

                                        System.out.println("Enter the username of the borrower:");
                                        String borrowerUsername = input.nextLine();

                                        // Find the borrower with the given username.
                                        Borrower borrower = null;
                                        for (Borrower b : borrowers) {
                                            if (b.getUsername().equals(borrowerUsername)) {
                                                borrower = b;
                                                break;
                                            }
                                        }

                                        // Check if the borrower was found.
                                        if (borrower == null) {
                                            System.out.println("Borrower not found.");
                                            return;
                                        }

                                        // Find the book with the given title.
                                        Book book = null;
                                        for (Book b : books) {
                                            if (b.getBookTitle().equals(bookTitle)) {
                                                book = b;
                                                break;
                                            }
                                        }

                                        // Check if the book was found.
                                        if (book == null) {
                                            System.out.println("Book not found.");
                                            return;
                                        }

                                        
                             

                                        // Add the book to the borrower's issued books list.
                                        borrower.addIssuedBook(book);

                                        // Decrease the number of available copies of the book.
                                        book.setAvailableCopies(book.getAvailableCopies() - 1);

                                        // Print a message that the book has been issued.
                                        System.out.println("The book has been issued to the borrower.");
                                        break;

                                 case 8:
                                        System.out.println("Enter the borrower's username:");
                                        String username12345 = input.nextLine();

                                        // Find the borrower with the given username.
                                        Borrower borrower12 = null;
                                        for (Borrower b : borrowers) {
                                            if (b.getUsername().equals(username12345)) {
                                                borrower12 = b;
                                                break;
                                            }
                                        }

                                        // Check if the borrower was found.
                                        if (borrower12 == null) {
                                            System.out.println("Borrower not found.");
                                            return;
                                        }

                                        // Get the total fines that the borrower owes.
                                           double totalFines = 0.0;
                                        

                                        // Prompt the user to pay the fines.
                                        System.out.println("The borrower owes a total of " + totalFines + " dollars in fines.");
                                        System.out.println("Would you like to pay the fines? (Y/N)");
                                        String response = input.nextLine();

                                        // If the user agrees to pay the fines, then deduct the fines from the borrower's account.
                                        if (response.equals("Y")) {
                                            //borrower.payFines(totalFines);
                                            System.out.println("The fines have been paid.");
                                        } else {
                                            System.out.println("The fines have not been paid.");
                                        }
                                        break;
                                    case 9:
                                        return;
                                }
                            }
                            }
                            
                        } */
                        case 4:{ // borrower funtionalities starts
                            while (true) {
                                System.out.println("Enter the username: for borrower");
                                String username = input.nextLine();

                                System.out.println("Enter the password: for borrower");
                                String password = input.nextLine();

                                // Check if the username and password exist in the ArrayList.
                                boolean found = false;
                                int borrowerIndex = -1;
                                for (int i = 0; i < borrowers.size(); i++) {
                                    if (borrowers.get(i).getUsername().equals(username) && borrowers.get(i).getPassword().equals(password)) {
                                        found = true;
                                        borrowerIndex = i;
                                        break;
                                    }
                                }

                                // If the borrower is not found, print "borrower not found".
                                if (!found) {
                                    System.out.println("Borrower not found.");
                                }else {
                                System.out.println("Welcome to the Borrower Menu");
                                System.out.println("What would you like to do?");
                                System.out.println("1. View issued books");
                                System.out.println("2. Return a book");
                                System.out.println("3. View transactions");
                                System.out.println("4. Back");

                                int option = input.nextInt();

                                switch (option) {
                                case 1 -> borrowers.get(borrowerIndex).displayBooks();
                                case 2 -> {
                                    System.out.println("Enter the book title to return:");
                                    String title = input.nextLine();
                                    borrowers.get(borrowerIndex).returnBook(title);
                                        }
                                case 3 -> borrowers.get(borrowerIndex).viewTransactions();
                                case 4 -> {
                                    return;
                                        }
                            }
                            }
                            }
                        
                        }
                            
                    }//switch(loginOption)    ends 
                        
                
            
        }// main switch case 1 ends
                case 2:{ // list of books
                    System.out.println("List of all books ");
                    for(int b = 0;books.size()<b;b++){
                        System.out.println((b+1)+" "+books.get(b).getBookTitle()+" by "+  books.get(b).getAuthor() );
                    }
                }
                
            }//main switch
                
        }//main while
    
    }//psvm

}//main class ends
        
        
        
    
    
    

/**
 * try{
            Book b1 = new Book("tata","papa","1234067891231");
            b1.display();
        }
        catch (illegalSBNException e){
            System.out.println(e.getMessage());
        }
        try{
        Librarian l1 = new Librarian("jaja","hey5here");
        l1.display();
        }
        catch(IllegalPasswordException e){
                System.out.println(e.getMessage());
        }
 */