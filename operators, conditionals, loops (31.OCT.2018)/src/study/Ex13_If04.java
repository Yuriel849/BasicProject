package study;

import java.util.Scanner;

public class Ex13_If04 {
	public static void main(String args[]) {
		/* Scanner�� ����
		 * 
		 * menu��ȣ�� �Է��ϼ���
		 * 1. �ѽ�, 2. �߽�, 3. ���
		 */
		
		// Scanner �� input��ĵ� ������ ���ؼ� (�츮�� ���� ù) input ������� ����� ����ϴ� ��.
		Scanner scan = new Scanner(System.in);
		int menu;
		System.out.println("�޴��� �������ּ���.");
		menu = scan.nextInt();
		scan.close();
		
		if (menu == 1) {
			System.out.println("�ѽ��� �����ϼ̽��ϴ�.");
		}
		if (menu == 2) {
			System.out.println("�߽��� �����ϼ̽��ϴ�.");
		}
		if (menu == 3) {
			System.out.println("����� �����ϼ̽��ϴ�.");
		}
	}

}
