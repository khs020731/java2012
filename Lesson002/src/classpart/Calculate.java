package classpart;

public class Calculate {
	int add ( int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	int getTenTotal() {
		int i;
		int total = 0;
		for(i=1;i<=10;i++) {
			total +=i;
		}
		return total;
	}
	void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
		}
		else {
			int result = num1 / num2;
			System.out.printf("%d / %d = %.2f\n", num1, num2, (float)num1/num2);
		}
	}
}
