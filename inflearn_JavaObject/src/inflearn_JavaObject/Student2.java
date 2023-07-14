package inflearn_JavaObject;

public class Student2 {
	
	int studentId;
	String studentName;
	
	Subject korean;
	Subject math;
	
	public Student2(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showStudent() {
		int total = korean.score  + math.score;
		System.out.println(studentName + "학생의 총점은 "+ total + "점 입니다.");
	}
}
