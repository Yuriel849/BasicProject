package study;

import java.util.Scanner;

public class Ex31_DoWhile01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* while���� do-while������ �ٲٱ�
		 * 
		 * do-while��
		 *		>> �ڵ带 �ּ��� �� �� ������ �� ����
		 * 		>> �ڵ带 �� �� ������ �� ���ǽ��� ��-������ ���� �ٽ� �ݺ��ϰų� �����Ѵ�
		 */
		do {
			System.out.print("100�� �Է��ϸ� �����մϴ� : ");
		} while(scan.nextInt() != 100);
		System.out.print("���α׷� ����");
	}
	
}
