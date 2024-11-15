
import java.util.ArrayList;
import java.util.Scanner;

public class CountryAccessChecker {
    public static void main(String[] args) {
        ArrayList<String> allowedCountries = new ArrayList<String>();
        allowedCountries.add("United States");
        allowedCountries.add("Canada");
        allowedCountries.add("India");
        allowedCountries.add("United Kingdom");
        allowedCountries.add("Australia");
        allowedCountries.add("Germany");
        allowedCountries.add("France");
        allowedCountries.add("Brazil");
        allowedCountries.add("South Africa");
        allowedCountries.add("Mexico");

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean validInput = false;

        // Single loop for handling attempts and valid input
        while (!validInput && attempts < 3) {
            System.out.println("Enter userCountry:");
            String userCountry = scanner.nextLine();
            if (userCountry.trim().isEmpty()) {
                System.out.println("Country cannot be empty. Please enter a valid country.");
            } else if (allowedCountries.contains(userCountry)) {
                System.out.println("Access Granted");
                validInput = true;  // Set to true when valid country is entered
            } else {
                try {
                    throw new CountryNotAllowedException("Access not Granted!!!!!!!!!");
                } catch (CountryNotAllowedException e) {
                    System.out.println(e.getMessage());
                }
                attempts++;  // Increment attempts after each failed entry

                if (attempts == 3) {
                    System.out.println("You have exceeded the maximum number of attempts.");
                }
            }
        }
    }
}

class CountryNotAllowedException extends Exception {
    public CountryNotAllowedException(String message) {
        super(message);
    }
}
