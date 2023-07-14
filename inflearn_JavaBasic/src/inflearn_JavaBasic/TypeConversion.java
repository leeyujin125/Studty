package inflearn_JavaBasic;

public class TypeConversion {

	public static void main(String[] args) {
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum; //int로 변환시키고 더함	1 + 0
		int iNum2 = (int)(dNum + fNum);		//더하고나서 int로 변환
					//더 큰 수와 더 작은 수의 연산은 자동으로 더 큰  수로 변환
					//값도 더 큰 수의 값으로
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int num = 1000;
		byte bNum = (byte)num;
		System.out.println(bNum);
		 
	}
}
