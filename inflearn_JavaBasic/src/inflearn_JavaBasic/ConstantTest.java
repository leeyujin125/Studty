package inflearn_JavaBasic;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 1024;
		final int MIN_NUM = 10;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 2048; -> constant라서 바꿀 수 없다.
	}
}
