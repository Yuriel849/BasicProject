package study;

public class Ex20_For02 {
	public static void main(String args[]) {
		for(int i=1; i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=1; i<10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=1; i<=9;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=0; i<=9;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		/* 1 ~ 10 ���� �� ¦���� ����ϰ� Ȧ���� ����ϼ���
		 * ��� 1. ������ ���
		 * ��� 2. if ���ǹ� ���
		 */
		
		for(int i=1; i<=10; i++) {
			if (i % 2 == 0) {
				System.out.print("¦�� : " + i + " ");
			}
		}
		System.out.println();

		for(int i=1; i<=10; i+=2) {
			System.out.print("Ȧ�� : " + i + " ");
		}
	}

}
