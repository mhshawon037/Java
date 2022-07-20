
public class HeighestNumber {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		if (num1>num2&&num1>num3&&num1>num4) {
			System.out.print("The largest number is : " +num1);
		}
		else if (num2>num1&&num2>num3&&num2>num4) {
			System.out.print("The largest number is : " +num2);
		}
		else if (num3>num1&&num3>num2&&num3>num4) {
			System.out.print("The largest number is : " +num3);
		}
		else if (num4>num1&&num4>num3&&num4>num2) {
			System.out.print("The largest number is : " +num4);
		}
		
		else {
			System.out.println("Try Again");
		}
	}

}
