package ch01;

public class PromotionExam {

    public static void main(String[] args) {
        // 자동 타입 변환 예제
        // float보다 double이 크며, float에는 뒤에 F를 붙인다.
        // 21억 이상의 정수를 표현할 때는 long 사용, 뒤에 L을 붙인다.

        byte byteValue = 10; // 바이트형은 8비트 정수
        int intValue = byteValue; // 자동 타입 변환
        System.out.println("자동타입 변환 -> int: " + intValue);

        char charValue = '가';
        intValue = charValue; // 자동 타입 변환
        System.out.println("자동타입 변환 -> int (char '가'): " + intValue);

        intValue = 500;
        long longValue = intValue;
        System.out.println("자동타입 변환 -> long: " + longValue);

        double doubleValue = intValue;
        System.out.println("자동타입 변환 -> double: " + doubleValue);
    }

}
