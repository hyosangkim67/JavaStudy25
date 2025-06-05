package ch05.Inheritance;

public class Teacher extends Person {
	private String teacherID;
	private int grade;
	private int room;
	private int Stcount;

	// 생성자
	public Teacher() {
		super();
	}

	// Getters
	public String getTeacherID() {
		return teacherID;
	}

	public int getGrade() {
		return grade;
	}

	public int getRoom() {
		return room;
	}

	public int getStcount() {
		return Stcount;
	}

	// Setters
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setStcount(int stcount) {
		this.Stcount = stcount;
	}

	// 메서드 재정의
	@Override
	public void show() {
		System.out.println("=========================");
		System.out.println("당신의 담당 학년은: " + getGrade());
		System.out.println("당신의 담당 교실은: " + getRoom());
		System.out.println("당신의 교직원 번호는: " + getTeacherID());
		System.out.println("교사 담당 학생 수는: " + getStcount());
		super.show();
	}

	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", grade=" + grade + ", room=" + room + ", Stcount=" + Stcount + "]";
	}
}

