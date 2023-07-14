package ch17;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		int arr2[] = new int[10];
		
		int[] numbers = {1, 2, 3, 4, 5,6,7,8};
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] ids;
		ids = new int[] {10, 20, 30};
		
		for(int id : ids) {	//int 타입의 id 0번부터 ids의 끝까지
			System.out.println(id);
		}
		
		int[] arr = new int[10];
		
		for(int i = 0, num=1; i<arr.length; i++, num++) {
			arr[i] = num;
		}
		
		int total = 0;
		for(int i = 0; i<arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
		
		int count=0;
		double[] dArr = new double[5];
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		double mtotal = 1;
		
//		for(double dnum : dArr) {
//			mtotal *= dnum;
//		}
		//↓
		//3번째 엘리먼트 까지는 데이터가 들어갔는데 총 5개인데 3개라서 나머지 두개는 들어가지 않았음
		//따라서 선언되지 않고 초기화된 나머지 2개가 곱해질때는 0이라서 출력이 0.0이 됨
		for(int i = 0; i<count; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);		

		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		for(char alpha : alphabets) {
			System.out.print(alpha + "  ");
		}
	}
}
