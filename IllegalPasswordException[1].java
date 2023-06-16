
package librarymanagementsystem;

import java.io.Serializable;

/**
 *
 * @author Rafi
 */
public class IllegalPasswordException extends Exception implements Serializable{

    public IllegalPasswordException() {
        super("Invalid password");
    }

    public IllegalPasswordException(String message) {
        super("Invalid password: " + message);
    }

    public static boolean isValidPassword(String password) {

        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
        }

        return hasDigit && hasUppercase && hasLowercase;
    }

}
