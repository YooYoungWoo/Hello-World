class OverridingTest {  // �޼ҵ� ġȯ(method overriding) ����
	public static void main(String[] args) {
		// Animal ��ü �����ϰ� �޼ҵ� m() ȣ��
		Animal a1 = new Animal();
		a1.m();
		// Bird ��ü �����ϰ� �޼ҵ� m() ȣ��
		Bird b = new Bird();
		b.m();
		// Bird ��ü�� �����Ͽ� Animal ��ü�� upcasting ��
		Animal a2 = new Bird();
		a2.m();
	}
}

class Animal {
	void m() {
		System.out.println( "Animal�� �޼ҵ� m() �� ȣ���. ");
	}
}

class Bird extends Animal {
	void m() {
		System.out.println( "Bird�� �޼ҵ� m() �� ȣ���. ");
	}
}