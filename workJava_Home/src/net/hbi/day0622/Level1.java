package net.hbi.day0622;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 값을 입력받지 않고 배열에 저장해서 사용*/

public class Level1 {
	public static void main(String[] args) {
		String[] number = {"2", "+", "3", "x", "7", "=", "23"};
		
		//배열을 문자열로 변환
		String change = String.join("", number);
		
		//StringTokenizer를 사용하여 문자열을 토큰화
		StringTokenizer st = new StringTokenizer(change, "+x=", true);
		
		int i = 0;
		while(st.hasMoreTokens()) {
			number[i] = st.nextToken();
			i++;
		}//while
		
		System.out.println(Arrays.toString(number));
		
		//근데 이제 여기서 [] 이거를 어케 삭제하지ㅋㅋ
		
	}//main
}//Level0
