package study;

public class Ex06_Variable05 {
	public static void main(String args[]) {
		// �� ������ ������ ��� ���ϱ�
		int score1 = 90;
		int score2 = 97;
		int score3 = 94;
		
		// ���� ���� ����
		int total;
		
		// ��� ���� ����
		float average;
		
		// +, -, *, /
		total = score1 + score2 + score3;
		average = total / 3.0F;
		// average = total / (float) 3;
		// average = (float) total / 3;
		
		/* �̰��� �ȵȴ�!!
		 * 		>> average = (float)(total / 3); == average = total / 3;
		 *  	>> �̹� ��ȣ �ӿ��� total/3�ϰ� �Ҽ����� ���� �� ������� float�� �ٲܻ��̴�
		 */
		
		// printf() �޼ҵ�� ����ϱ�
		System.out.printf("���� : %d��, ��� : %.2f��", total, average);
	}
	
}
