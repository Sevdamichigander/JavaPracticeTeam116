package day4;

import java.util.Scanner;

public class Odev5_KrediKarti {
    public static void main(String[] args) {
        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there aren’t 16 digit print
         * “Invalid credit card number”
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)
         */

        Scanner scanner = new Scanner(System.in);

        // Ask user for name, surname and credit card number
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your surname: ");
        String surname = scanner.next();
        System.out.print("Enter your credit card number: ");
        String creditCardNumber = scanner.next();

        // Check if credit card number has 16 digits
        if (creditCardNumber.length() != 16) {
            System.out.println("Invalid credit card number");
            return;
        }

        // Format name and surname
        String formattedName = name.substring(0, 1).toUpperCase() + "*** " +
                surname.substring(0, 1).toUpperCase() + "****";

        // Format credit card number
        String formattedCreditCardNumber = "**** **** **** " +
                creditCardNumber.substring(12);

        // Print output
        System.out.println("Name : " + formattedName);
        System.out.println("CCN  : " + formattedCreditCardNumber);
    }
}


