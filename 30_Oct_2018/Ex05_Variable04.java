package study;

public class Ex05_Variable04 {
	public static void main(String args[]) {
		// float type�� ����� �ʱ�ȭ
		float f;
		/* f = 0.1;
		 * 		>> ����
		 * 		>> �Ǽ��� ���̻簡 ������ default�� double�� �����Ǵµ� f�� float�̱� ����
		 * 		>> float(4byte�� ǥ��)�� double(8byte�� ǥ��)���� ���� �ڷ���
		 * 		>> double�� float�� ��ܳ������� �� ���� ���� ���̰� �׷��� ������ �ս��� ���輺�� �����Ѵ�
		 */
		f = 0.1f;
		f = 0.1F;
		f = (float)10.1; // ���̻� ���̴� ��� ��������ȯ ��Ų ��
		
		/* double d;
		 * d = 3.14;
		 * �Ǽ��� default �ڷ����� double�̱⿡ �Ǽ� �ڿ� d��� �� �ʿ䰡 ����!!
		 * 		>> float�� default�� �ƴ� float������ �ٲٱ� ���ؼ� ���� ���̴�
		 * 
		 * d = 3.14f;
		 * ���� ����!!!
		 * 		>> d�� double(8byte�� ǥ��)�� float(4byte�� ǥ��)�� 3.14f���� ũ��
		 * 	
		 * 		>> !!! ���� �ڷ����� �����͸� �� ū �ڷ����� �ִ� ���� �ڷ�ս� ���� ��ȯ�Ǿ� �־����⿡ ��������!!!
		 */
		
		char ch = 'G';
		
		System.out.printf("ch : %c\n", ch);
		System.out.printf("ch : %c\n", ch + ('a' - 'A'));

		ch = 'f';
		
		System.out.printf("ch : %c\n", ch);
		System.out.printf("ch : %c\n", ch - ('a' - 'A'));
	}
	
}
