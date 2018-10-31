package study;

public class Ex06_Operator06 {
	public static void main(String args[]) {
		int num = 5;
		
		/* ����Ʈ ����Ʈ ������ (<<)
		 * ���׿��� ����, ���׿��� ����Ÿ���� ��
		 * ���� ��Ʈ �� 1�� �ڸ��� ������ ����ŭ �������� �̵�
		 * ������ ���������� 2�� n������ŭ ���� ����� ��ȯ
		 * ex)
		 * 		5     --> 0 0 1 0 1
		 * (num << 2) --> 1 0 1 0 0 
		 */
		num <<= 2;
		// num = num << 2;�� ����
		System.out.println("1. left shift w/ assignment (num <<= 2): " + num);
		// ������ "num = num << 2;"�� �����߱� ������ num�� ���� ������ �ٲ����� ��
		
		// OR
		System.out.println("2. left shift wo assignment (num << 2): " + (num << 2));
		System.out.println("\t >> num remains unchanged (num == " + num + ")");
		// ����Ʈ �����ڷ� ���� �ٲ㼭 ������ ��, ���� num ���� �ٲ��� �ʴ´�
		
		/* ����Ʈ ����Ʈ ������ (>>)
		 * ���׿��� ����, ���׿��� ����Ÿ���� ��
		 * ���� ��Ʈ �� 1�� �ڸ��� ������ ����ŭ ���������� �̵�
		 * ������ ���������� 2�� n������ŭ ���� ����� ��ȯ (�������� ��������)
		 * ex)
		 * 		5     --> 0 0 1 0 1
		 * (num >> 2) --> 0 0 0 0 1
		 */
		num = num >> 2;
		System.out.println("3. right shift w/ assignment (num >>= 2): " + num);
		// OR
		System.out.println("4. right shift wo assignment (num >> 2): " + (num >> 2));
		System.out.println("\t >> num remains unchanged (num == " + num + ")");
	}

}