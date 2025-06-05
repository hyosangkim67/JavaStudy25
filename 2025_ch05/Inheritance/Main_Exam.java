package ch05.Inheritance;

import java.util.Scanner;

public class Main_Exam {

	static Scanner inputStr = new Scanner(System.in);
	static Scanner inputInt = new Scanner(System.in);

	public static Teacher[] teachers = null;
	public static Student[] students = null;

	static { // main() 실행 시 초기값 지정용
		teachers = new Teacher[10];
		students = new Student[10];
	}

	public static void main(String[] args) {
		boolean run = true;

		while (true) {
			System.out.println("Chaeha LMS 프로그램입니다");
			System.out.println("1. 교사등록");
			System.out.println("2. 학생등록");
			System.out.println("3. 프로그램 종료");
			System.out.print(">>> ");
			String select = inputStr.next();

			switch (select) {
			case "1":
				Person person1 = inputInfo(new Teacher()); 
				Teacher child = (Teacher) person1;

				System.out.println("교직원 번호를 입력하세요:");
				child.setTeacherID(inputStr.next());

				System.out.println("담당 학년을 입력하세요:");
				child.setGrade(inputInt.nextInt());

				System.out.println("담당 교실을 입력하세요:");
				child.setRoom(inputInt.nextInt());

				child.show();
				break;

			case "2":

				Person person2 = inputInfo(new Student()); 
				Student child2 = (Student) person2;

				System.out.println("학생 번호를 입력하세요:");
				child2.setStudentID(inputStr.next());

				System.out.println("학년을 입력하세요:");
				child2.setGrade(inputInt.nextInt());

				System.out.println("학점을 입력하세요:");
				child2.setGpa(inputInt.nextInt());

				child2.show();
				break;

			case "3":
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	public static Person inputInfo(Person person) {
		System.out.println("이름을 입력하세요:");
		person.setName(inputStr.next());

		System.out.println("몸무게를 입력하세요:");
		person.setWeight(inputInt.nextInt());

		System.out.println("나이를 입력하세요:");
		person.setAge(inputInt.nextInt());

		return person;
	}
}
