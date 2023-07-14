package inflearn_JavaObject;

public class Student2Test {

	public static void main(String[] args) {
		
		Student2 studentLee = new Student2(100, "Lee");
		Student2 studentKim = new Student2(100, "Kim");
		
		studentLee.setKoreanSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		studentKim.setKoreanSubject("국어", 80);
		studentKim.setMathSubject("수학", 99);
		
		studentLee.showStudent();
		studentKim.showStudent();
	}

}
