package PackageBetLibSig;

import java.util.Scanner; // allows us to input something
import java.util.Random; // allows us to get random characters for passwords

public class AA2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // gets user's input
		Random input2 = new Random(); // for generating random characters
		boolean attendance = true; // to keep the program running until the user is finished
		
		System.out.println("Wifi Attendance 0.1v"); // title of program
		System.out.println("______________________________________________________________________________________________________________________");
		
		while(attendance){ // a loop that keeps asking for attendance
			System.out.println("Enter your Full Name, Grade-Section, and Reason. or Type 'exit' to Finish."); // asks for information or finish the program
			
			System.out.print("\nFull Name: "); // prompts for our full name
			String name = input.nextLine(); // stores the name inputed
			
			
			if(name.equalsIgnoreCase("exit")) { // if typed exit, the user wants to close the program
				System.out.println("Attendance Finished. "); // prompt user that attendance is finished
				attendance = false; // stops the loop
				
				
			} else { // if user didn't type exit, the program keeps asking for more info
				System.out.print("Grade-Section: "); // prompt user for section
				String gradeSection = input.nextLine(); // stores the section inputed
				
				System.out.print("Reason: "); // prompt user for the reason 
				String reason = input.nextLine(); // stores the reason inputed by the user
				
				String password = ""; // an empty string which is a box that stores the characters for the wifi code
				String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890"; // set of characters to be used
				
				for(int i = 0;i < 8; i++){ // generate password until there are 8 characters in total
					password += character.charAt(input2.nextInt(character.length())); // password has 8 characters total
				} 
				
				System.out.println("______________________________________________________________________________________________________________________");
				System.out.println("\nStudent: " + name + " | Section: "+ gradeSection + " | Reason: "+ reason + " | Wifi Password: "  + password); // shows user their new information and randomly generated wifi password.
				System.out.println("______________________________________________________________________________________________________________________");
				
				boolean validInput = false; // keeps track if the input is invalid
				
				
				while(!validInput) { // loop runs until user type 'yes' or 'no'
					System.out.print("\nContinue Wifi Attendance? (yes/no): "); // ask user if they want to continue the program or not
					String answer = input.nextLine(); // store user's answer
					
					if(answer.equalsIgnoreCase("yes")) { // if yes then, the programs goes back asking info
						validInput = true; // marks input as valid then breaks the loop
						
					} else if(answer.equalsIgnoreCase("no")) { // if no, then program stops and end
						validInput = true;
						attendance = false; // stops the loop
						System.out.println("Attendance Finished.");
			 					
					} else { // if user type's other words, the program asks again
						System.out.println("Invalid Input. Try 'yes' or 'no'"); // tells user that the input given is invalid
						
					}
					
				}
			}
			
		}

	}

}
