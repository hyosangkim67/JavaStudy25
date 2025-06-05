package ch05.test_0529;

import java.util.Scanner;

public class Main_0529 {

    static Scanner in = new Scanner(System.in);
    public static StudentDTO[] students = new StudentDTO[5];

    public static void main(String[] args) {
        ScoreService service = new ScoreService();
        boolean run = true;

        while (run) {
            System.out.println("====================================");
            System.out.println("\n=== 0529 성적 처리 프로그램입니다! ===");
            System.out.println("1. 성적 입력");
            System.out.println("2. 전체 성적 보기");
            System.out.println("3. 개인 성적 보기");
            System.out.println("4. 성적 수정하기");
            System.out.println("5. 성적 삭제하기");
            System.out.println("9. 성적 프로그램 종료");
            System.out.print("원하는 메뉴를 선택해 주세요! >>> ");

            int select = in.nextInt();
            switch (select) {
                case 1:
                    service.scoreAdd(in, students);
                    break;
                case 2:
                    service.scoreList(students);
                    break;
                case 3:
                    service.scoreOne(in, students);
                    break;
                case 4:
                    service.scoreMod(in, students);
                    break;
                case 5:
                    service.scoreDel(in, students);
                    break;
                case 9:
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("1, 2, 3, 4, 5, 9 중 하나를 선택해주세요.");
            }
        }
    }
}
