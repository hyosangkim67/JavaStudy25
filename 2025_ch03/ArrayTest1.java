package ch03;

import java.util.Scanner;

public class ArrayTest1 {

    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        System.out.println("====== MBC 성적 처리 ======");
        System.out.print("학생 수를 입력해 주세요! >>> ");
        int count = inputInt.nextInt();
        System.out.println(count + "명의 성적을 입력하겠습니다!");

        String[] names = new String[count];
        int[] kors = new int[count];
        int[] mats = new int[count];
        int[] engs = new int[count];

        boolean run = true;
        while (run) {
            System.out.println("\n=== 성적 처리 메뉴 ===");
            System.out.println("1. 성적 입력");
            System.out.println("2. 전체 성적 보기");
            System.out.println("3. 개인 성적 보기");
            System.out.println("4. 성적 수정하기");
            System.out.println("5. 성적 삭제하기");
            System.out.println("9. 성적 프로그램 종료");
            System.out.print("원하는 메뉴를 선택해 주세요! >>> ");

            int select = inputInt.nextInt();

            switch (select) {
                case 1:
                    scoreAdd(names, kors, mats, engs);
                    break;
                case 2:
                    scoreList(names, kors, mats, engs);
                    break;
                case 3:
                    scoreOne(names, kors, mats, engs);
                    break;
                case 4:
                    scoreMod(names, kors, mats, engs);
                    break;
                case 5:
                    scoreDel(names, kors, mats, engs);
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

    private static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                System.out.print((i + 1) + "번째 이름을 입력해주세요: ");
                names[i] = inputStr.next();
                System.out.print("국어 점수: ");
                kors[i] = inputInt.nextInt();
                System.out.print("수학 점수: ");
                mats[i] = inputInt.nextInt();
                System.out.print("영어 점수: ");
                engs[i] = inputInt.nextInt();
                System.out.println(names[i] + "의 점수 입력이 완료되었습니다!\n");
            }
        }
    }

    private static void scoreList(String[] names, int[] kors, int[] mats, int[] engs) {
        System.out.println("\n=== 전체 성적 보기 ===");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.printf("%s - 국어: %d, 수학: %d, 영어: %d\n", names[i], kors[i], mats[i], engs[i]);
            }
        }
    }

    private static void scoreOne(String[] names, int[] kors, int[] mats, int[] engs) {
        Scanner input = new Scanner(System.in);
        System.out.print("검색할 학생 이름을 입력하세요: ");
        String name = input.next();

        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.printf("%s - 국어: %d, 수학: %d, 영어: %d\n", names[i], kors[i], mats[i], engs[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }

    private static void scoreMod(String[] names, int[] kors, int[] mats, int[] engs) {
        Scanner inputStr = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);

        System.out.print("수정할 학생의 이름을 입력하세요: ");
        String name = inputStr.next();
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                found = true;
                System.out.println("현재 점수: 국어 " + kors[i] + ", 수학 " + mats[i] + ", 영어 " + engs[i]);
                System.out.print("새 국어 점수: ");
                kors[i] = inputInt.nextInt();
                System.out.print("새 수학 점수: ");
                mats[i] = inputInt.nextInt();
                System.out.print("새 영어 점수: ");
                engs[i] = inputInt.nextInt();
                System.out.println("수정 완료!");
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }

    private static void scoreDel(String[] names, int[] kors, int[] mats, int[] engs) {
        Scanner inputStr = new Scanner(System.in);
        System.out.print("삭제할 학생의 이름을 입력하세요: ");
        String name = inputStr.next();
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                names[i] = null;
                kors[i] = 0;
                mats[i] = 0;
                engs[i] = 0;
                found = true;
                System.out.println("삭제 완료!");
                break;
            }
        }

        if (!found) {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }
}