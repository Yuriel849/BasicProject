package study;

public class Ex04_Variable03 {
	static int number = 897;
	// number�� main �޼ҵ� ��, �޼ҵ�� ����... ���� ���� (global variable)
		// Java������ "��������"���ٴ� "�������" == "(���)�ʵ�"��� ǥ��
		// ��������� �ڵ����� �ʱ�ȭ (<-> ���� ������ �������� �ʱ�ȭ�ؾ�, �ʱ�ȭ���� ������ ��뵵 ����)
		// ��������� �� �ڷ����� �⺻������ �ڵ����� �ʱ�ȭ
			/* byte/short/int/long�� �⺻���� 0
			 * float/double�� �⺻���� 0.0
			 * char�� �⺻���� null ('\u0000')... �ַ� ' '�� ǥ�� (����)
			 * boolean�� �⺻���� false
			 */
	// number1, number2�� main �޼ҵ忡 ���� ��... ���� ���� (local variable)
		// ��� ��������� ���� �� �ʱ�ȭ�� ���Ŀ� ����� �� ����

	public static void main(String args[]) {
		System.out.printf("number1 = %d\n", number);
		/* main �޼��� �տ� static�� �پ� �ִµ�,
		 * static�̶�� �� �޼ҵ忡�� ���� �����Ϳ� �����Ϸ��� �� �����͵� static�̶�� �پ��־�� �Ѵ�.
		 * 		>> number �տ� static�̶�� �������ϱ� ���� �����ϴ�.
		 */

		// ������ ���� ��ġ
		// ���� ���� - ��𿡼��� ������ ���� ����
		System.out.println("���α׷� ����");
		
		int number1 = 10;
		System.out.printf("number1 = %d\n", number1);
		
		int number2 = 20;
		// ������ �����ϰ� �����ϸ� ���������� �ʴ´�
		System.out.printf("number2 = %d\n", number2);
		// ������ ���������� �ʱ�ȭ���� �ʾ����� ������ ����
	}

}
