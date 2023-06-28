package net.hbi.day0622;

import java.util.Scanner;
import java.util.StringTokenizer;

/* 값을 입력받으면서 사용*/

/* 작성일 : 2023-06-28
 *  작성자 : 이유진
 *  버전 : 1.0
 *  
 *  문제점 : 수식 계산을 앞에서부터 진행함. 
 *  			수식을 제외한 것들을 입력하면 오류가 남
 *  
 *  더 추가하고 싶은 내용 : push와 pop, ArrayList 사용. 
 *  									입력한 수식을 결과와 같이 표기 (StringBuilder를 이용하면 될거 같은데..)
 * */

public class scanner_cal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산할 수식을 입력하세요 >>> ");
		String num = sc.nextLine();
		
		int result = cal(num);	//입력받은 수식을 계산하기 위해 'cal'메서드 호출 ->  result에 저장
		System.out.println("결과 >>> "+result);		//cal 메서드에서 반환된 result -> 
																		//윗 줄의 result 변수 값을 출력하기 위해 사용
		
		sc.close();
	}//main
	
	public static int cal(String num) {
		//입력받은 수식을 StringTokenizer로 쪼개고 계산
		//첫 번째 토큰을 초기 값으로 설정. 다음 토큰부터는 해당 연산자에 따라 계산
		//연산자에 따라 cal2 메서드를 호출하여 계산을 수행
		StringTokenizer st = new StringTokenizer(num, "+-*/", true);	
		//   +-*/   를 기준으로 나눔. true를 지정해서 구분자도 토큰에 포함
		
		int result = 0;	//계산 결과를 저장할 변수
		int a = 0;	//피연산자(숫자)를 저장할 변수
		String b = "";	//연산자를 저장할 변수. cal메서드 실행 중 연산자를 만날 때마다 저장
		
		while(st.hasMoreTokens()) {	//남아있는 토큰이 있을 때까지 반복
			String token = st.nextToken().trim();	//다음 토큰을 읽어와서 공백 제거 -> token에 저장
			
			if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
				//현재 토큰이 연산자인지 확인
				b = token;		//연산자일 경우 b에 저장
			}else {
				a = Integer.parseInt(token);	//피연산자일 경우 a에 형변환하여 저장
				
				if(b.equals("")) {	//이전에 저장한 연산자가 없는 경우 result에 현재 피연산자 저장
					result  = a;
				}else {
					result = cal2(result, a, b);		//이전에 저장한 연산자가 있는 경우 cal2메서드 불러서 연산 
																//-> result에 저장
				}//if~else
			}//if~else
		}//while
		
		return result;
	}//cal
	
	public static int cal2(int su, int su2, String b) {	//입력받은 수식을 기반으로 연산을 수행 -> 결과 반환
		//cal메서드에 저장된 연산자를 전달받는 매개변수 b. 
		//su와 su2의 값을 b에 저장된 연산자에 따라 연산한 결과를 반환
		switch(b) {
			case "+" :
				return su + su2;
			case "-" :
				return su - su2;
			case "*" :
				return su * su2;
			case "/" :
				return su / su2;
			default:
				 throw new IllegalArgumentException("잘못된 연산자입니다: " + b);	//잘못된 연산자일 경우 예외
		}//switch
	}//cal2
	
}//scanner_cal



/*
 
 throw new IllegalArgumentException("잘못된 연산자입니다: " + b);

예외를 발생시키는 코드. 연산자가 잘못된 경우(지원하지 않는 형식)에 실행


throw -> 예외를 발생시키는 역할. 이 키워드 뒤에는 발생시킬 예외 객체를 지정해야 함

new IllegalArgumentException() -> Java에서 제공하는 예외 클래스 중 하나. 
메서드의 인자가 잘못된 경우 발생시키는 예외. 메서드의 매개변수로 전달된 값이 유효하지 않을 때 사용. 
 new IllegalArgumentException()은 IllegalArgumentException의 인스턴스를 생성하는 코드입니다.
 
 */




