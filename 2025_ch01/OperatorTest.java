package ch01;

		public class OperatorTest {

			public static void main(String[] args) {
				// 지금까지 배운 변수 타입은 기본 타입으로, 자바에서 객체 없이 사용됨
				// String도 원래 객체를 생성해야 하지만 편의상 생략함

				String strval1 = "김기원";
				String strval2 = "김기원";
				System.out.println(strval1 == strval2);
				
				/*
				 * 이미 위에 김기원이라는 객체를 만들었기 때문에 김기원을 새로 생성한 건 아니다. 
				 * strval1로 만든 김기원이라는 객체를 힙에서 동일하게 지정한 거다.
				 */

				String strval3 = new String("김기원"); // 객체 생성 문구
				System.out.println(strval1 == strval3); // false
				// strval1의 "김기원"이라는 객체와 strval3의 "김기원"이라는 객체는 다르다. 같은 아이템이지만 다른 오브젝트다.
				// new라고 붙이면 아예 새로운 객체를 만드는 것 같다. 좀 추상적인데...
				
				// 객체의 주소를 판단할 때는 ==를 사용하지만, 객체의 안쪽 값을 비교할 때는 내장된 메서드를 사용해야 한다.
				// String은 객체고, 객체 안쪽에는 메서드들이 들어 있다.
				// 메서드가 보고 싶으면 .을 찍자.
				boolean eq1 = strval1.equals(strval3);
				System.out.println("strval1과 strval3를 비교하기 위해, equals 메서드를 사용한 결과는 " + eq1);
				
				

	
	}

}
