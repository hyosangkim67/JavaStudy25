package ch05.test_0529;

import java.util.Scanner;

public class ScoreService {

    public void scoreAdd(Scanner in, StudentDTO[] students) {
        StudentDTO student = new StudentDTO();
        System.out.print("이름: ");
        student.setNames(in.next());
        System.out.print("국어 점수: ");
        student.setKors(in.nextInt());
        System.out.print("수학 점수: ");
        student.setMats(in.nextInt());
        System.out.print("영어 점수: ");
        student.setEngs(in.nextInt());

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("입력 완료: " + student);
                return;
            }
        }
        System.out.println("더 이상 입력할 수 없습니다.");
    }

    public void scoreList(StudentDTO[] students) {
        System.out.println("\n=== 전체 성적 보기 ===");
        for (StudentDTO studentDTO : students) {
            if (studentDTO != null) {
                System.out.printf("%s - 국어: %d, 수학: %d, 영어: %d\n",
                		studentDTO.getNames(), studentDTO.getKors(), studentDTO.getMats(), studentDTO.getEngs());
            }
        }
    }

    public void scoreOne(Scanner in, StudentDTO[] students) {
        System.out.print("검색할 학생 이름을 입력하세요: ");
        String name = in.next();

        for (StudentDTO studentDTO : students) {
            if (studentDTO != null && studentDTO.getNames().equals(name)) {
                System.out.println("학생 정보: " + studentDTO);
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }

    public void scoreMod(Scanner in, StudentDTO[] students) {
        System.out.print("수정할 학생 이름을 입력하세요: ");
        String name = in.next();

        for (StudentDTO studentDTO : students) {
            if (studentDTO != null && studentDTO.getNames().equals(name)) {
                System.out.print("새 국어 점수: ");
                studentDTO.setKors(in.nextInt());
                System.out.print("새 수학 점수: ");
                studentDTO.setMats(in.nextInt());
                System.out.print("새 영어 점수: ");
                studentDTO.setEngs(in.nextInt());
                System.out.println("수정 완료: " + studentDTO);
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }

    public void scoreDel(Scanner in, StudentDTO[] students) {
        System.out.print("삭제할 학생 이름을 입력하세요: ");
        String name = in.next();

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getNames().equals(name)) {
                students[i] = null;
                System.out.println("삭제 완료.");
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");
    }
}
