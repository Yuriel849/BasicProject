package study;

public class Ex04_Operator04 {
	public static void main(String args[]) {
		// �������� "name �̸�" OR "identifier �ĺ���"��� �θ�
		int number = 10;
		
		/* int number = 10 * 3;
		 * 		>> �̹� "number"��� �̸��� ������ ������ ����
		 * 		>> �Ǵٽ� �Ȱ��� �̸��� ������ �����Ϸ��ϴϱ� �������� ��
		 */
		
		/* int num = 10;
		 * number = 10 * 3;
		 * 		>> �� ���, number��� ������ ������� ���� ����
		 * 		>> ��������� ���� ������ ����Ϸ��ϴϱ� �������� ��
		 */

		number = 10 * 3;
		System.out.printf("1. number = 10 * 3 : %d\n", number);
		
		number = number + 1;
		System.out.printf("2. number = number + 1 : %d\n", number);
		
		number++;
		System.out.printf("3. number++ : %d\n", number);
		
		number += 1;
		System.out.printf("4. number += 1 : %d\n", number);
		
		boolean result = (number += 30) >= 50;
		System.out.println("result : " + result);
		System.out.println((number += 30) >= 50);
		
	}

}