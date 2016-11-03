import java.util.Scanner;

/**

 *

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment #3, Program #1

 * Date Last Modified: 11/1/16

 *

 */
public class Assignment3b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Finish the assignment
		
		Scanner userInput = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = userInput.nextLine();
		
		System.out.println("What is your Last name?");
		String lastName = userInput.nextLine();
		
		System.out.println("What Grade are you in?");
		int grade = userInput.nextInt();
		
		System.out.println("What is your grade average");
		double average = userInput.nextDouble();
		
		System.out.println("What is your student ID");
		int studentID = userInput.nextInt();
		
		System.out.println("What is your login?");
		String login = userInput.next();
		
		
		System.out.println(String.format("%-20s" + login, "Login:" ));
		System.out.println(String.format("%-20s" + studentID, "ID:" ));
		System.out.println(String.format("%-20s" + lastName + "," + firstName, "Name:" ));
		System.out.println(String.format("%-20s" + average, "Average:" ));
		System.out.println(String.format("%-20s" + grade, "Grade:" ));
		
		
		userInput.close();
	}

}
