package study;

import java.util.Scanner;

public class Ex17_Switch03 {
	public static void main(String args[]) {
		// ��(month)�� �Է��ؼ� �ش� ���� �� �ϱ��� �ִ��� �˾ƺ���
		Scanner scan = new Scanner(System.in);
		
		// ���� �����ϴ� ����
		int month;
		
		// ��¥�� �����ϴ� ����
		int date;
		
		System.out.print("1 ~ 12 �� �� �ϳ��� �Է��ϼ��� : " + "\n");
		month = scan.nextInt();
		
		switch (month) {
		// ��ü highlight�ϰ� tab ������ ��� �鿩���� �� 
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				date = 31; break;
			case 4: case 6: case 9: case 11:
				date = 30; break;
			case 2:
				date = 28; break;
			default:
				date = -1;
		}
		
		if(date != -1) {
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�", month, date);
		}else {
			System.out.printf("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
		}
	}

}
