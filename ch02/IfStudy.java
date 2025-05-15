package ch02;

import java.util.Scanner;

public class IfStudy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("이름을 입력하세요.\n>>> ");
        String name = input.nextLine();

        System.out.print("점수를 입력하세요.\n>>> ");
        int score = input.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println(name + "님이 입력하신 점수는 90점 이상입니다.");
                System.out.println("점수: " + score + " → 등급: A");
            } else if (score >= 80) {
                System.out.println(name + "님의 점수는 80~89점입니다.");
                System.out.println("점수: " + score + " → 등급: B");
            } else if (score >= 70) {
                System.out.println(name + "님의 점수는 70~79점입니다.");
                System.out.println("점수: " + score + " → 등급: C");
            } else if (score >= 60) {
                System.out.println(name + "님의 점수는 60~69점입니다.");
                System.out.println("점수: " + score + " → 등급: D");
            } else {
                System.out.println(name + "님은 낙제입니다.");
                System.out.println("점수: " + score + " → 등급: F");
            }
        } else {
            System.out.println("잘못된 점수입니다. 0~100 사이의 숫자를 입력하세요.");
        }

        System.out.println("프로그램 종료");
        input.close();
    }
}
