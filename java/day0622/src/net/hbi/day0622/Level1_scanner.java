package net.hbi.day0622;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 값을 입력받으면서 사용*/

public class Level1_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 계산할 수식을 입력해주세요.  ");
		String num = sc.nextLine();

		
		//StringTokenizer를 사용하여 문자열을 토큰화
		StringTokenizer st = new StringTokenizer(num, "+-");
		
		int i = 1;
//		while(st.hasMoreTokens()) {
//			num += Integer.parseInt(st.nextToken());
//			i++;
//		}//while
		
		
		
		System.out.println("합계 : "+num);
		sc.close();
	}//main
}//Level0
