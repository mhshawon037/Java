import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int marks;
		System.out.println("Enter your Marks : ");
		marks = input.nextInt();

		if (marks >= 80&& marks<=100) {
			System.out.println("A+");
		}

		else if (marks >= 70&& marks<=100) {
			System.out.println("B+");
		}

		else if (marks >= 60&& marks<=100) {
			System.out.println("C+");
		} 
		else if (marks >= 50&& marks<=100) {
			System.out.println("D+");
		}
		else if (marks>100) {
			System.out.println("Give the valid number . Thanks:) ");
			
		}
		
		else {
			System.out.println("Fail");
		}
		
	}

}
