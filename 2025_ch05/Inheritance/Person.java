package ch05.Inheritance;

public class Person {
	// 부모 클래스

	// 필드
	private String name;
	private int height;
	private int weight;
	private int age;

	// 생성자
	public Person(String name, int height, int weight, int age) {
		super(); // (생략 가능)
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public Person() {
		super();
	}

	// Getters
	public String getName() {
		return name + "님"; 
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 출력용 메서드
	public void show() {
		System.out.println("----------------------------------------------------");
		System.out.println("당신의 존함은: " + getName());
		System.out.println("당신의 연세는: " + getAge());
		System.out.println("당신의 키는: " + getHeight() + "cm");
		System.out.println("당신의 몸무게는: " + getWeight() + "kg");
		System.out.println("----------------------------------------------------");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + ", age=" + age + "]";
	}
}

