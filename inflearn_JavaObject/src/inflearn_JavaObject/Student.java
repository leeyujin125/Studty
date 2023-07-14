package inflearn_JavaObject;

public class Student {
	
	int studentId;
	String studentName;
	String studentAddress;
	
	public Student() {} //오버로딩
	
	public Student(int id, String name) {
		
		studentId = id;
		studentName = name;
	}
	
	public Student(int id, String name, String studentAddress) {
		
		studentId = id;
		studentName = name;
		this.studentAddress = studentAddress;
	}
	
	public void showStudentInfo() {
		System.out.println(studentId+ ", "+studentName + ", "+studentAddress);
		
		//System.out.println();
	}
	
	public String getStudentName() {	//get = 이 클래스를 쓰는 쪽 입장에서 만들어야
		return studentName;
	}
	

}
