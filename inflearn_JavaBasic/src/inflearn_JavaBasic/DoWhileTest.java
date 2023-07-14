package inflearn_JavaBasic;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
		System.out.println("더 하고 싶은 수를 입력하세요. 0을 입력하면 이제까지 입력한 숫자들을 더합니다. ");
		do {
			input = sc.nextInt();
			sum += input;
		}while(input != 0);
		System.out.println(sum);
		
		sc.close();
	}
}
