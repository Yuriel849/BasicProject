package study;

public class Ex03_Operator03 {
	public static void main(String args[]) {
		
		/* ����(����) ������
		 * Ư�� ������ ���� 1�� ����(����)��Ű�� ������
		 * ���Կ����� ���� ���� ������Ŵ!!!
		 */
		int num = 10;
		System.out.println("1. num : " + num);
		System.out.println("2. num : " + num++);
		System.out.println("3. num : " + num);
		// num++�� println ���� �� �����ϱ⿡ num�� ���� ���������� println �������� ���� ������ �ʴ´�
		System.out.println("4. num : " + ++num + "\n");
		// ++num�� println ���� �� �����ϱ⿡ println �������� �� ���δ�
		
		/*
		 * ����/���� ����(����) �������� ����
		 */
		int num1 = 10;
		int num2 = ++num1;
		System.out.printf("���� ���������� : num1 = %d, num2 = %d\n", num1, num2);
		
		int num3 = 10;
		int num4 = num3++;
		System.out.printf("���� ���������� : num3 = %d, num4 = %d\n\n", num3, num4);
		
		num = 10;
		System.out.printf("%d %d %d %d %d %d\n", num++, ++num, num--, ++num, num++, num);
	}

}

