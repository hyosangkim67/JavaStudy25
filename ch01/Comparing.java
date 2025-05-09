package ch01;

public class Comparing {

	public static void main(String[] args) {
		/*
		 * 
		 * 비교 연산자는 동등 비교와 크기 비교가 있다.
		 * == : 같냐?
		 * != : 다르냐?
		 * > : 초과, 크냐?
		 * >= : 이상, 크거나 같냐?
		 * < : 미만, 작냐?
		 * <= : 이하, 작거나 같냐?
		 * 
		 */
		
		int num1 = 10;
		int num2 = 10;
		boolean result1a = (num1 == num2);
		// boolean 타입은 true, false 두 개의 값을 가진다.
		System.out.println(result1a);
		boolean result1b = (num1 != num2);
		System.out.println(result1b);
		
		char char1 = 'A'; // 유니코드 65
		char char2 = 'B'; // 유니코드 66
		boolean result2 = (char1 < char2); // 65 < 66 ==> true
		System.out.println(result2);
		// A와 a를 비교하는 것도 해 봤다. 둘의 유니코드가 다르다.
		// 1과 '1'을 비교하는 것도 했다. 둘은 다르다.
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // 정수 1과 실수 1.0은 같다?
		// 비교 연산자에 타입이 다른 변수를 비교하면 자동 타입 변환이 일어난다.
		// 이때 자동 타입 변환은 큰 값으로 타입을 맞춘다. 여기서는 int가 double로 맞춰졌다고 보면 되겠다.
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println("========================");
		System.out.println(v5 == v4); // false
		// 실수형은 부동 소수점 연산을 수행해서 근사값으로 표현한다.
		//  true로 만들기 위해서는 강제 타입 변환이 필요하다.
		System.out.println((float)v4 == v5); // v4를 float으로 변환하면 true가 출력된다.
		System.out.println(v4 == (double)v5); // 이건 false가 나온다. 왜...? 자동 타입 변환이라고 한다. 43행과 같다.
		
		System.out.println((int)(v4*10) == (int)(v5*10)); // true 
		
		System.out.println("========================");
		System.out.println("========================");
		
		char x = 88;
		char xx = 'X';
		System.out.println(x == xx); // 88과 X는 같다고 나온다.

	}

}
