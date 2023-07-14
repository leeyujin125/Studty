package ch14;

public class CalculatorTest {
	public static void main(String[] args) {
		
		//CompleteCalc calc = new CompleteCalc();
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + "+" + num2 + "="+ calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "="+ calc.substract(num1, num2));
		System.out.println(num1 + "*" + num2 + "="+ calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "="+ calc.divide(num1, num2));
		
		//calc.showInfo();	//CompleteCalc가 아닌 다른 메서드 타입으로 지정하면 오류가 남
		calc.desciption();
		
		int[] arr = {1, 2, 3, 4, 5};
		int total = Calc.total(arr);
		System.out.println(total);
	}
}
