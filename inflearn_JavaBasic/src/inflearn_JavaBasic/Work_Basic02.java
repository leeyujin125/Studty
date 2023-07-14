package inflearn_JavaBasic;

public class Work_Basic02 {
	public static void main(String[] args) {
		
		int dan, time;
		
		for(dan = 2; dan<=9; dan++) {
			if((dan%2) != 0) { continue; }
			for(time=1; time<=9; time++) {
				System.out.println(dan+"X"+time+"="+(dan*time));
			}
		}
		
	}
}
