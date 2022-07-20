import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, sum;
		double avg;
		System.out.println("Enter 1st integer number : ");
		num1 = input.nextInt();

		System.out.println("Enter 2nd integer number : ");
		num2 = input.nextInt();

		System.out.println("Enter 3rd integer number : ");
		num3 = input.nextInt();

		sum = num1 + num2 + num3;

		avg = (sum) / 3.0;
		System.out.println("Summation is :" + sum);

		System.out.println("Average is : " + avg);

	}

}
