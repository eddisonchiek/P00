
public class Calculator {
	public int add(int a, int b) {
		int total = a + b;
		if((a > 9999 && a < 0) && ( b > 9999 && b < 0)) {
			total = 0;
		}
		return total;
		
	}
	public int subtract(int a,int b) {
		int total = a - b;
		if((a > 9999 && a < 0) && ( b > 9999 && b < 0)) {
			total = 0;
		}
		return total;
	}
	public int multiply(int a,int b) {
		int total = a * b;
	     if((a > 9999 && a < 0) && ( b > 9999 && b < 0)) {
		total = 0;
	}
		return a * b;
	}
	public int divide (int a, int b) {
		int total =  a/b;
		if(b ==0) {
			throw new IllegalArgumentException();}
		if((a > 9999 && a < 0) && ( b > 9999 && b < 0)) {
			total = 0;
		}
			return total;
		}
	}


