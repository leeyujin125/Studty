package inflearn_JavaBasic;

public class Work_Basic03 {
	public static void main(String[] args) {
		
		int dan, time;
		
		for(dan = 2; dan<=9; dan++) {
			for(time=1; time<=dan; time++) {
				System.out.println(dan+"X"+time+"="+(dan*time));
			}
		}
		
	}
}
