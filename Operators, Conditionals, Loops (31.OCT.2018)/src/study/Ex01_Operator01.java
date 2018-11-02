package study;

public class Ex01_Operator01 {
	public static void main(String args[]) {
		/* ������
		 * "����"������, "����"������ ���� �ǿ������� ���� ��Ÿ����!!!
		 * 
		 * &&, || --> 2���� ������ �Ϲݳ������
		 * &, | --> �ϳ��� ������ ��Ʈ�����ڿ�
		 * 	>> AND�� OR���� �켱������ ����
		 * 
		 * ! --> ������������, boolean���� ��� ����
		 * ~ --> ��Ʈ��ȯ������, ��Ʈ���� �� & ���������� ��� ����
		 */

		int number1 = 33;
		int number2 = 10;
		int result;
		
		int num = 5;
		result = num + 1;
		/* 	>> num�� ���� ��� 5, result�� ���� 6
		 * 
		 * num += 1 OR num++
		 * 	>> num ��ü�� ���� 6���� �ٲ�
		 */

			
		// % (������) ������
		// ¦��/Ȧ�� �Ǻ�, ��� �Ǻ��� ���
		result = number1 % number2;
		System.out.printf("%d %c %d = %d\n", number1, '%', number2, result);
			
		// number1 % 2 == 0 <-- ¦��
		// number1 % 2 != 0 <-- Ȧ��
		// number1 % 3 == 0 <-- 3�� ���
		
		/* int���� ���� �ڷ����� �����ϸ� �ڵ������� int������ ��ȯ�ȴ�
		 * �׷��� �ٽ� "c"�� ������ �� byte�� ���� ����ȯ�� �ʿ䰡 �ִ�
		 */
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);
		// byte c = (byte) a + (byte) b; �� ����
		
		/* byte c = (byte) a + b
		 * �������� ���ǹ��ϴ�
		 * 		>> �̹� a�� byte�ε� �ٽ� byte�� �ٲ㼭 ���ϰ�?
		 * 		>> ������ b�� int�� ��ȯ�Ǳ⿡ �� ū int ������ ���Ѵ�
		 * 		>> �׸��� int�� byte�� �����Ϸ��� ��������
		 */
		
		/* Overflow
		 * ex) int a = 1mil., int b = 2mil.
		 * 		>> a & b separately are the right size for int
		 * 		>> HOWEVER a*b exceeds the size capacity of int and overflow occurs
		 * 		>> solve by type casting a or b into long, then assign to a long type variable
		 * 
		 * long c = (long) a * b
		 * 		>> ū �ڷ����� �����͸� ���� �ڷ����� �����ͷ� �ٲܶ��� ��������ȯ ����ؾ�
		 * 		>> ���� �ٸ� �ڷ��� 2�� �̻��� ���� �����ϸ� �� ū �ڷ����� ���߰� �ڵ� ����ȯ�Ѵ�
		 * 		>> ������ ����� �� ū �ڷ������� �ٲ� ���·� ���´�
		 */
	}

}
