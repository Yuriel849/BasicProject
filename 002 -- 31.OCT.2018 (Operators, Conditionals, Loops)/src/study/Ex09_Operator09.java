package study;

import java.util.Scanner;
/* left ctrl + left shift + letter "o"
 * 		--> automatically imports necessary imports
 */

public class Ex09_Operator09 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ 7��° ���ڸ� �Է��ϼ��� : ");
		int gender = sc.nextInt();
		
		String str = (gender == 1 || gender == 3) ? "����" : "����";
		System.out.printf("����� %s�Դϴ�\n", str);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
		// ���׿����ڸ� ��ø�Ͽ� ����� �� �ִ�... ������ ���� ��ø�� ���� �򰥸��Եǰ� �׷��� �����ϴ°� ����...
		System.out.printf("����� ������ %c�Դϴ�\n", grade);
	}

}