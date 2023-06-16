
package librarymanagementsystem;

import java.io.Serializable;

/**
 *
 * @author Rafi
 */
public class illegalSBNException extends Exception implements Serializable{
    public static boolean hasDigit = false;
    public static boolean isDigitThirteen = false;
    public static int numberOfDigits = 0;
    public illegalSBNException(){
        super();
    }
    public illegalSBNException(String s){
        super("Invalid ISBN: "+ s);
        
    }
    
    public static boolean isValidISBN(String isbn){
        numberOfDigits = 0;
        for (char c : isbn.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                numberOfDigits++;
                
            }
        }
        if(numberOfDigits == 13){
            isDigitThirteen = true;
        }
        return hasDigit && isDigitThirteen;
    }
}
    
    
    

        
    

