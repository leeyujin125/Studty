package ch14;

public interface Calc {

	public static final double PI = 3.14;
	int Error = -999999;
	
	public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void desciption() {
		myMethod();
		mystaticMethod();
		System.out.println("정수를 계산합니다. == 여기까지 desciption");
		
	}
	
	private void myMethod() {
		System.out.println("private method");
	}
	
	static int total(int[] arr) {
		//myMethod();		사용 불가
		mystaticMethod();
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	private static void mystaticMethod() {
		System.out.println("mystaticMethod");
	}
}
