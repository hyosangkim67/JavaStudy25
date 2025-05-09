package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// Casting = 강제 타입 변환
		// 누수가 발생해도 강제로 적용하는 방법을 강제 타입 변환이라고 함.
		
		int intValue = 123456789;
		byte byteValue = (byte) intValue;
		System.out.println("int 타입 값 출력: " + intValue);
		System.out.println("byte 타입 값 출력: " + byteValue);
		// 바이너리넘버에서 8비트만 뽑음 > 데시멀넘버로 치환
		
		int kor = 87;
		int eng = 99;
		int math = 97;
		int total = kor + eng + math ;
		System.out.println("국영수 총점: " + total);
		double avg = total / 3;
		System.out.println("평균 점수" + avg);
		// 여기서 소수점이 0으로 나오는 이유는 total이 int기 때문이다.
		avg = (double) total / 3; // casting하고 싶은 변수 타입을 앞에 붙인다. (double)
		System.out.println("평균 점수" + avg);
		
		

	}

}
