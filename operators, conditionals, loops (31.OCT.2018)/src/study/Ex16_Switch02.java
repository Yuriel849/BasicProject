package study;

import java.util.Scanner;

public class Ex16_Switch02 {
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
		switch ((int) average/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5: case 4: case 3:
		case 2: case 1: case 0:
			grade = 'F';
			break;
		default:
			grade = '?';
		}
		
		if (grade == '?') {
			System.out.println("������ �ٽ� �Է��ϼ���\n");
		}else {
			System.out.printf("����� ������ %c �����Դϴ�\n", grade);
		}
	}

}
