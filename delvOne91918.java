package Lotto;

import java.util.Random;
import java.util.Scanner;

public class delvOne91918 {

	public static void main(String[] args) {
		
		
		 //I want the system to scan for the user's input number (entry/token) 
		 //then I want to take that number and have the system tell the user to put
		 //in their favorite 3 digit lotto number. Then I want to have the user put
		 //in their second favorite 3 digit lotto number. Then I want to add the result
		 //of both of the numbers and see if they are equal

		//Declaring variables
		int number1 = 0;
		int number2 = 0;
		int newLotto;
		int sum = 0;
		Random rand = new Random(); 
		int value = rand.nextInt(999); 
		newLotto = number1 + number2;
		
		
		
		System.out.println("Hi! I'm Lotto Helper, I help realign your favorite lotto numbers! Please press enter after each prompt.");
		System.out.println("Lotto Helper was created by Christa Stephens for Unit 1 Java.");
		System.out.println("Start by thinking of your two favorite lotto numbers and I'll give you a new number at the end!");
		System.out.println("Are you ready to begin?");
		System.out.println(" ");
		
		
		//scanning for user input to receive token/entry to compute data.
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your favorite three digit lotto number and press enter.");
		number1 = scnr.nextInt();
		if (number1 <100){ System.out.println("Please enter a three digit number and press enter.");
		number1 = scnr.nextInt();
		}
		if (number1 >999){ System.out.println("Please enter a three digit number and press enter.");
		number1 = scnr.nextInt();
		}
		
		
		//using a combo of the while loop and mod to break apart the user entry. 
		//it took me years to figure this out (insert crying emoji) 
		while (number1 > 0) {
	        System.out.println(number1 % 10);
	        number1 = number1 / 10;
	        int add = number1;
		}
				 
		
		
		//second part of data collection from user.
		System.out.println("Please enter your second favorite three digit lotto number.");
		number2 = scnr.nextInt();
		
		if (number2 <100){ System.out.println("Please enter a three digit number.");
		number2 = scnr.nextInt();
		}
		if (number2 >999){ System.out.println("Please enter a three digit number.");
		number2 = scnr.nextInt();
		}
		
		
		//breaking apart user number and adding. Making sure the numbers
		//don't add by using an if statement.
		//additional giving the numbers in reverse so that the user can 
		//use those as well for the lottery
		while (number2 > 0) {
	        System.out.println(number2 % 10);
	        number2 = number2 / 10;
	        int add = number2;
	        if (number1 == number2) {
	        	System.out.println("False");
	
        	scnr.close();
        	//adding a random number that will give the user a new lotto number 
        	System.out.println( "Try this for your next lotto number! " + value);
        	System.out.println("Please gamble responsibly!");
        	}
        	}
        }
       
	}
