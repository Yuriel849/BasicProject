package study;

import java.util.Scanner;

public class Ex12_If03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� : ");
		int id = sc.nextInt();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		int pw = sc.nextInt();
				
		/* id�� 333�̰� pw�� 555�� ���,
		* "�α��� ����!!!" ����ϰ�
		* �ƴ� ��쿡�� "�α��� ����!!!" ���
		*/
		
		/* 1. �������ڸ� ����ϴ� ���
		* id�� pw�� ���ÿ� �¾ƾ� �α��ο� ������
		*/
		if (id == 333 && pw == 555) {
			System.out.println("1. �α��� ����!!!");
		} else {
			System.out.println("1. �α��� ����!!!");
		}
		
		/* 2. ��ø�� if���� ����ϴ� ���
		* if�� ���ο� if���� �����ϴ� ��� 
		*/
		if (id == 333) {
			if (pw == 555) {
				System.out.println("2. �α��� ����!!!");
			} else {
				System.out.println("2. ��й�ȣ�� �߸� �Է��ϼ̾��.");
			}
		} else {
			System.out.println("2. ���̵� �߸� �Է��ϼ̾��.");
		}
		
		/* 3. boolean ������ ����ϴ� ��� */
		boolean flag;
		flag = (id == 333);
		flag = flag && (pw == 555);
		if (flag) {
			System.out.println("3. �α��� ����!!!");
		} else {
			System.out.println("3. �α��� ����!!!");
		}
		
		boolean flag1, flag2;
		flag1 = (id == 333);
		flag2 = (pw == 555);
		if (flag1 && flag2) {
			System.out.println("4. �α��� ����!!!");
		} else {
			System.out.println("4. �α��� ����!!!");
		}
	}

}