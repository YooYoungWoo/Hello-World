class OverridingTest {  // 메소드 치환(method overriding) 예제
	public static void main(String[] args) {
		// Animal 객체 생성하고 메소드 m() 호출
		Animal a1 = new Animal();
		a1.m();
		// Bird 객체 생성하고 메소드 m() 호출
		Bird b = new Bird();
		b.m();
		// Bird 객체를 생성하여 Animal 객체로 upcasting 함
		Animal a2 = new Bird();
		a2.m();
	}
}

class Animal {
	void m() {
		System.out.println( "Animal의 메소드 m() 이 호출됨. ");
	}
}

class Bird extends Animal {
	void m() {
		System.out.println( "Bird의 메소드 m() 이 호출됨. ");
	}
}