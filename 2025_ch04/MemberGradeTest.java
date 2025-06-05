package ch04;

import java.util.Scanner;

public class MemberGradeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("몇 명의 회원을 등록하시겠습니까? >>> ");
        int count = input.nextInt();

        Member[] members = new Member[count];
        Member memberUtil = new Member();

        System.out.println("\n회원 가입을 시작합니다!");
        for (int i = 0; i < count; i++) {
            System.out.println("\n[" + (i + 1) + "번 회원 가입]");
            members[i] = memberUtil.memberAdd(input);
            System.out.println(members[i].name + "님 " + members[i].grade + " 등급으로 가입되었습니다.");
        }

        System.out.println("\n== 현재 가입된 회원 목록 ==");
        for (Member member : members) {
            System.out.println(member);

        input.close();
    }
}
