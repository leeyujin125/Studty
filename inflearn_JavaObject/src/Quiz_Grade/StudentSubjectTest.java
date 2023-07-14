package Quiz_Grade;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student Lee = new Student(1001, "Lee");
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학", 98);
		
		Student Kim = new Student(1002, "Kim");
		Kim.addSubject("국어", 70);
		Kim.addSubject("수학", 80);
		Kim.addSubject("영어", 90);
		
		Lee.showSudentInfo();
		System.out.println("=============");
		Kim.showSudentInfo();
		
				
	}

}
