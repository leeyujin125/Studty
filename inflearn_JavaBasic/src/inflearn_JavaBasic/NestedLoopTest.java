package inflearn_JavaBasic;

public class NestedLoopTest {

	public static void main(String[] args) {

		int dan =2;
		int time = 1;
		
		for(dan=2; dan<=9; dan++) {
			for(time=1; time<=9; time++) {
				System.out.println(dan+"x"+time+"="+(dan*time));
			}
			System.out.println();
		}//for
		
		dan=2;
		time=1;
		while(dan <= 9) {
			time=1;		//다시 초기화
			while(time <= 9) {
				System.out.println(dan+"x"+time+"="+(dan*time));
				time++;
			}
			dan++;
		}//while
		
	}
}
