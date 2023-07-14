package inflearn_JavaBasic;

public class BitTest {

	public static void main(String[] args) {

		int num1 = 5; //00000101
		int num2 = 10; //00001010
		
		System.out.println(num1 | num2); //00001111
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num1<<2);	//두 칸 옆으로 보냄
		System.out.println(num1); //값은 변하지 않음
		
		System.out.println(num1 <<= 2); //assign(대입)을 해야
		System.out.println(num1);		//num1의 값이 변함
	}

}
