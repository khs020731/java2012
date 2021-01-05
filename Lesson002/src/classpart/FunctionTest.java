package classpart;

import java.util.Scanner;

public class FunctionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = add(num1, num2);
		int sum2 = minus(num1, num2);
		int sum3 = multiple(num1, num2);
		int sum4 = divide(num1, num2);
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d - %d = %d\n", num1, num2, sum2);
		System.out.printf("%d * %d = %d\n", num1, num2, sum3);
		System.out.printf("%d / %d = %d\n", num1, num2, sum4);
	}	
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	public static int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	public static int multiple(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static int divide(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}
}
