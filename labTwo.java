package Home;

//import scanners from JRE library to help find difference in dates.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class labTwo {

	public static void main(String[] args) {

		// Need to calculate duration between two dates (in years)
		// Need two dates from user
		// find the difference in dates
		//Cool goal - find out exactly how old you are!

		//Declaring variables
        int days; 
        int months; 
        int years; 
		
		// Format for getting birth date, reverse so that it will be easier to go 
		// into int-string for parse
        
        System.out.println("Welcome to the Birth Date Extractor.");
        System.out.println("This extractor was written by Christa Stephens for Unit 1 Java.");
        System.out.println("This program is designed to tell you exactly how old you are, down to the date.");
        System.out.println("Are you ready to get started? Be sure to press 'enter' after you input your information.");
        System.out.println(" ");
        System.out.print("Enter your birth date in this format YYYY-MM-DD format: ");
        System.out.println(" ");

       
        Scanner scanner = new Scanner(System.in);

        String oldestDateString = scanner.nextLine();
        //legit took me years to figure out this parse thing
        //thank God for the googlers
        LocalDate oldestDate = LocalDate.parse(oldestDateString);
        
        //scanning for birth date and then today's date. 
        //Using period difference to get outcome
        System.out.println("Cool, your birth date is: " + oldestDate + " Thank you for the information!");
        System.out.println(" ");
        System.out.print("Enter today's date in this format YYYY-MM-DD format: ");
        System.out.println(" ");

        String newestDateString = scanner.nextLine();
        LocalDate newestDate = LocalDate.parse(newestDateString);
        System.out.println("Cool beans, today is " + newestDate + " now let's see how exactly how old you are.");
        System.out.println(" ");

        Period difference = oldestDate.until(newestDate);
        
        days = difference.getDays();
        months = difference.getMonths();
        years = difference.getYears();
        scanner.close();

        System.out.println("You are exactly: " + months + " Months, " + days + " Days, and " + years + " Years old.");
        System.out.println(" ");
        System.out.println("Put your birth information into www.numerology.com to find out additional information about your birth meaning.");
		
	}

}
