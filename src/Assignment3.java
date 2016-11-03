import java.util.Scanner;

/**

 *

 * Name: Dylan Angell

 * Teacher: Mr.Hardman

 * Assignment #3, Program #1

 * Date Last Modified: 10/27/16

 *

 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO create a working average calculator
		
		Scanner userInput = new Scanner(System.in);
		
		
		
		System.out.println("Enter your marks please");
		
		System.out.println("Mark 1:");
		double mark1 = userInput.nextDouble();
		
		System.out.println("Mark 2:");
		double mark2 = userInput.nextDouble();

		System.out.println("Mark 3:");
		double mark3 = userInput.nextDouble();
		
		System.out.println("Mark 4:");
		double mark4 = userInput.nextDouble();
		
		System.out.println("Mark 5:");
		double mark5 = userInput.nextDouble();
		
		double Average = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
		
		System.out.println(String.format("%10s %10.2f%%", "Mark  1:", mark1));
		System.out.println(String.format("%10s %10.2f%%", "Mark  2:", mark2));
		System.out.println(String.format("%10s %10.2f%%", "Mark  3:", mark3));
		System.out.println(String.format("%10s %10.2f%%", "Mark  4:", mark4));
		System.out.println(String.format("%10s %10.2f%%", "Mark  5:", mark5));
		System.out.println(String.format("%10s %10.2f%%", "Average:", Average));
		
		userInput.close();
	}

}
