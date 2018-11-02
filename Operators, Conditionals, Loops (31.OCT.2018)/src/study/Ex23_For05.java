package study;

import java.util.Scanner;

public class Ex23_For05 {
	public static void main(String[] args) {
		// ���� 3���� �Է� �޾Ƽ� �հ�, ���� ū ��, ���� ���� ���� ���ϼ���
		Scanner scan = new Scanner(System.in);
		
		// �հ�, ���� ū ��, ���� ���� ���� ������ ����
		int sum, max, min;
		sum = max = min = 0;
				
		for(int i=1, input; i<=3; i++) {
			System.out.printf("%d ��° ������ �Է��ϼ��� : \n", i);
			// �Է¹��� ������ input�� �Ҵ��ϰ� ���� sum�� ������Ų��
			sum += input = scan.nextInt();
			/* input�� scan.nextInt()�� �������� ����� ������ �ʱ�ȭ �ʿ����
			 * max & min�� �񱳿����� �ϴµ�, �񱳿����� if-else ������ �׻� �����ϴ� �͵� �ƴϱ⿡ �ʱ�ȭ�� �ʿ�
			 * 		>> if�� ���� ���Ѵٸ� max & min�� input�� ���Ե��� �ʴ´�
			 * 		>> else���� �ʱ�ȭ���� ���� ���·� �񱳿����� �õ��ϰ� �ȴ�... 
			 */
			
			// �ִ밪 & �ּҰ� ���ϱ�
			// i�� 1�� �� == ù��° �ݺ� ��
			if(i == 1) {
				// max & min�� input���� �ʱ�ȭ
				max = min = input;
			}else {
				// input���� max������ ũ�� ���ο� max ���� ��
				if(input > max) {
					max = input;
				}
				// input���� min������ ������ ���ο� min ���� ��
				if(input < min) {
					min = input;
				}
			}
		}
		System.out.printf("�հ� : %d �ִ밪 : %d �ּҰ� : %d\n", sum, max, min);	
	}

}
