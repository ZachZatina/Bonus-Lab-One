import java.util.Scanner;

/*
 * 
 * Zachariah Zatina
 * 
 * A program that converts numerical grades and turns them into letter grades
 * 
 */
public class BonusLabOne {
	
	public static void main(String args[]) {
		
		//variables
		Scanner scnr = new Scanner(System.in);
		char userChar = 'y';
		int grade;
		
		//introduction in program
		System.out.println("Welcome to the Letter Grade Converter!");
		
		//loop set up to keep program running based on user input
		while(userChar == 'y' || userChar == 'Y') {
			
			//user input
			System.out.print("Enter a numerical grade: ");
			grade = scnr.nextInt();
			
			//nested if else statements to take the user input numeral grade and output letter grade
			if (grade <= 100 && grade >= 90) {
				if (grade <= 100 && grade >= 99) {
					System.out.println("Letter Grade: A+");
				}
				else if (grade <= 98 && grade >= 92) {
					System.out.println("Letter Grade: A");
				}
				else {
					System.out.println("Letter Grade: A-");
				}
			}
			else if (grade < 90 && grade >= 80) {
				if (grade < 90 && grade >=88) {
					System.out.println("Letter Grade: B+");
				}
				else if (grade <= 87 && grade >= 82) {
					System.out.println("Letter Grade: B");
				}
				else {
					System.out.println("Letter Grade: B-");
				}
			}
			else if (grade < 80 && grade >= 70) {
				if (grade < 80 && grade >= 78) {
					System.out.println("Letter Grade: C+");
				}
				else if (grade <= 77 && grade >= 72) {
					System.out.println("Letter Grade: C");
				}
				else {
					System.out.println("Letter Grade: C-");
				}
			}
			else if (grade < 70 && grade >= 60) {
				if (grade < 70 && grade >= 68) {
					System.out.println("Letter Grade: D+");
				}
				else if (grade <= 67 && grade >= 62) {
					System.out.println("Letter Grade: D");
				}
				else {
					System.out.println("Letter Grade: D-");
				}
			}
			else {
				System.out.println("Letter Grade: F");
			}
			
			System.out.print("Continue? (y/n): ");
			userChar = scnr.next().charAt(0);
			System.out.println("");
		}
		
		System.out.println("Goodbye!");
		scnr.close();
	}

}
