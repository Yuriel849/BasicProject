package study;

import java.util.Scanner;

public class Ex10_If01 {
	public static void main(String args[]) {
		int number = 12;
		
		// if�� 2�� �ݺ�, ���ǹ��� ������Ų�ٸ� if�� �� �� ���� ����
		if (number % 2 == 0) {
			System.out.printf("1. %d�� ¦���Դϴ�\n", number);
		}
		if (number % 2 == 1) {
			System.out.printf("1. %d�� Ȧ���Դϴ�\n", number);
		}
		
		// if-else�� 1�� ����
		if (number % 2 == 0) {
			System.out.printf("2. %d�� ¦���Դϴ�\n", number);
		} else {
			System.out.printf("2. %d�� Ȧ���Դϴ�\n", number);
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ 7��° ���ڸ� �Է��ϼ��� : \n");
		int gender = sc.nextInt();
		
		if (gender == 1 || gender == 3) {
			System.out.println("3. ����� �����Դϴ�");
		}
		if (gender == 2 || gender == 4) {
			System.out.println("3. ����� �����Դϴ�");
		}
		
		if (gender == 1 || gender == 3) {
			System.out.println("4. ����� �����Դϴ�");
		} else {
			System.out.println("4. ����� �����Դϴ�");
		}
	}

}