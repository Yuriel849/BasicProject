package study;

import java.util.Scanner;

public class Ex14_If05 {
	public static void main(String args[]) {
		// �� ������ ������ ��� ���ϱ�
		int score1 = 90;
		int score2 = 97;
		int score3 = 94;
		
				
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("ù��° ������ �Է��ϼ��� : ");
		score1 = sc.nextInt();
		System.out.printf("�ι�° ������ �Է��ϼ��� : ");
		score2 = sc.nextInt();
		System.out.printf("����° ������ �Է��ϼ��� : ");
		score3 = sc.nextInt();
		sc.close();
				
				
		// ���� ���� ����
		int total;
				
		// ��� ���� ����
		float average;
		
		// ���� ���� ����
		char grade;
				
		// +, -, *, /
		total = score1 + score2 + score3;
		average = total / 3.0F;
		
		// printf() �޼ҵ�� ����ϱ�
		System.out.printf("���� : %d��, ��� : %.2f��\n", total, average);
		
		// ������ �߸� �Էµ� ���
		if(average > 100 || average < 0) {
			grade = '?';
		/* 100�� �ʰ��� ���� if������ ó���ϰ�
		 * ���⼭(else if)�� 90�� �̻��� ��츸 ó����
		 */
		}else if(average >= 90) {
			/* ���� 100�� �ʰ��� ��츦 ������ ó������ �ʾҴٸ�
			 * if (average >= 90 && average <=100)
			 */
			grade = 'A';
		}else if(average >= 80) {
			grade = 'B';
		}else if(average >= 70) {
			grade = 'C';
		}else if(average >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		if (grade == '?') {
			System.out.println("������ �ٽ� �Է��ϼ���\n");
		}else {
			System.out.printf("����� ������ %c �����Դϴ�\n", grade);
		}
	}

}
