package inflearn_JavaBasic;

public class WhileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			sum += num;
			num++;		//num += 1;	//반드시 assign을 해줘야 더해짐
		}
		System.out.println(sum);
		System.out.println(num);
		System.out.println(num+1);	//끝에 1을 더했다고 해서 num의 값이 변하진 않음
	}

}
