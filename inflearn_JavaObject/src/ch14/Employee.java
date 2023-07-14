package ch14;

public class Employee {

	private static int serialNum = 1000;
	
	private int employeeId;
	private String emplyeedName;
	private String department;
	
	public static int getSerialNum() {
		int i = 0;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}

	public Employee() {
		employeeId = ++serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmplyeedName() {
		return emplyeedName;
	}
	public void setEmplyeedName(String emplyeedName) {
		this.emplyeedName = emplyeedName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
