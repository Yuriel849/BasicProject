package study;

public class Ex26_For06 {
	public static void main(String[] args) {
		/* ���� ���� Ȧ���� �������� ���� Ȧ����,
		 * 		���� ���� ¦���� �������� ���� ¦���� ���������� �ϼ���
		 */
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i % 2 == j % 2) {
					System.out.printf("%d X %d = %d \n",  i, j, (i*j));
				}
			}
		System.out.println();
		}
	}
}
