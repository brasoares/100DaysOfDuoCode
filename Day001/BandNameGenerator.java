import java.util.Scanner;

public class BandNameGenerator { // Class declaration
  public static void main(String[] args) { // Main method
    // Creates a Scanner object to read input
    Scanner scanner = new Scanner(System.in);

    // Variable declarations
    String bornCity;
    String petsName;
    
    // DAY ONE on 2025.04.24
    // This program will gather some user data and generate a band name for the person

    System.out.println("Welcome to the Band Name Generator program!");
    
    System.out.println("In which city were you born?");
    bornCity = scanner.nextLine();

    System.out.println("What's your pet's name?");
    petsName = scanner.nextLine();

    System.out.println("Your band name could be " + bornCity + " " + petsName + ".");

    scanner.close();
  }
}