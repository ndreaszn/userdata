import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Login system that validates user credentials.
 * Asks user to enter the username and the password,
 * then compares it to the data stored in the database
 * (arrays) to and verifies if they match.
 *
 * @author Denise Name
 * @version 1.0
 */


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // database with the usernames and the corresponding passwords
        String[] user = {"ndreaszn", "gromero929", "andreyuh"};
        String[] password = {"password123", "andee929", "random321"};

        System.out.println("---------------------");
        System.out.println("       LOG-IN");
        System.out.println("---------------------");
        System.out.println("Enter username: ");

        String username = sc.nextLine();

        // verify if username was found
        int userFound = confirmUser(username, user); // int because it's what we'll use to determine which number to use for user[x] and password[x]

        // if not found, it exits the program
        if (userFound == -1) {
            System.out.println("Username not found!");
            return;
        }

        System.out.println("Username: " + username);
        System.out.println("Enter password: ");

        String psw = sc.nextLine();

        // verifies if password matches the user's password
        boolean isPWCorrect = confirmPassword(psw, password, userFound);

        if (isPWCorrect) {
            System.out.println("Logged in successfully!");
        } else {
            System.out.println("Incorrect!");
        }

    }

    public static int confirmUser(String username, String[] user) {
        // loops through all usernames in the array
        for (int i = 0; i < user.length; i++) {
            if (user[i].equals(username)) {
                return i; // returns the index where username was found to use to check the password afterwards
            }
        }
        return -1; // username not found
    }

    public static boolean confirmPassword(String psw, String[] password, int index) {
        return password[index].equals(psw); // uses index from the previous function
    }
}