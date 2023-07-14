package inflearn_JavaObject;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");		
		//Student라는 객체 타입으로 studentLee라는 참조 변수를 선언
		//참조 변수 = 생성된 객체를 가리키는 변수
		studentLee.studentAddress = "Seoul";
		
		Student studentKim = new Student(101, "Kim", "New York");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
}
