package ch05.Inheritance;

public class Student extends Person {
	// Student는 Person의 자식 클래스

	// 추가 필드
	private String studentID; // 학번
	private int grade; // 학년
	private int gpa; // 학점

	// 생성자
	public Student(String name, int height, int weight, int age, String studentID, int grade, int gpa) {
		super(name, height, weight, age); // 부모 생성자 호출
		this.studentID = studentID;
		this.grade = grade;
		this.gpa = gpa;
	}

	public Student(String name, int height, int weight, int age) {
		super(name, height, weight, age);
	}

	public Student() {
		super();
	}

	// Getters
	public String getStudentID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getGpa() {
		return gpa;
	}

	// Setters
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("=========================");
		System.out.println("당신의 학번은: " + getStudentID());
		System.out.println("당신의 학년은: " + getGrade());
		System.out.println("당신의 학점은: " + gpa);
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", grade=" + grade + ", gpa=" + gpa + "]";
	}
}
