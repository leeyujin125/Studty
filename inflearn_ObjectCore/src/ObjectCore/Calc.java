package ObjectCore;

public interface Calc {

	public static final double PI = 3.14;
	int Error = -999999;
	
	public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
