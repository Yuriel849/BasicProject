package study;

class Outer2 {
	int value = 10;
	
	class Inner2 {
		int value = 20;
		void method1() {
			int value = 30;
			
				// �������� value ���
			System.out.println(value);
				// Inner ����Ŭ������ �ν��Ͻ� ���� ���
			System.out.println(this.value);
				// Outer �ܺ�Ŭ������ �ν��Ͻ� ���� ���
			System.out.println(Outer2.this.value);
		} // method1() ��.
	} // ����Ŭ���� Inner ��.
} // �ܺ�Ŭ���� Outer ��.

class Ex07_Outer_Inner02 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Outer2.Inner2 inner = out.new Inner2();
		inner.method1();
	} // main() ��.
} // Ŭ���� ��.
