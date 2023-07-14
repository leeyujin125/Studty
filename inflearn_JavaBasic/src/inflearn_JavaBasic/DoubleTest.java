package inflearn_JavaBasic;

public class DoubleTest {
	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14F; //3.14를 float에 넣을 수 없음. F나 f를 넣어서 4바이트로 처리
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		//부동소수점 오류
		double mynum = 1;
		for( int i=1; i<100000; i++) {
			mynum += 0.1;
		}//for
		System.out.println(mynum);
		
	}
}
