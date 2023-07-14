package inflearn_JavaObject;

public class FunctionTest {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);	//n1, n2는 메인의 지역변수
		System.out.println(total);
		
		sayHello("Hello");
		
		int sum = calcSum();
		System.out.println(sum);
	}
													//n1, 2와 num1, 2는 같지 않아도 되지만 데이터 타입은 같아야 함
	public static int addNum(int num1, int num2) {	//num1, num2는 addNum의 지역변수
		
		return num1 + num2;
	}
	
	public static void sayHello(String str) {
		System.out.println(str);
	}
	
	public static int calcSum() {		//값을 받지 않음 (매개변수 없음)
		int i;
		int sum=0;
		for(i=0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}
}
