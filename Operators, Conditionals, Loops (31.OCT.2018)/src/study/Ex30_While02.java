package study;

import java.util.Scanner;

public class Ex30_While02 {
	public static void main(String[] args) {
		// while���� �ݺ�Ƚ���� �Һи��� �� �ַ� ���
		Scanner scan = new Scanner(System.in);
		
		System.out.print("100�� �Է��ϸ� �����մϴ� : ");
		while(scan.nextInt() != 100) {
			System.out.print("100�� �Է��ϸ� �����մϴ� : ");
		}
		System.out.print("���α׷� ����");
	}

}
