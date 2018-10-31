package study;

import java.util.Scanner;

public class Ex08_Operator08 {
	public static void main(String args[]) {
		/* �� ������ ������ ��� ���ϱ�
		 * 		>> 22OCT2018�� Ex06_Variable05�� ����
		 */
		
		int score1 = 90;
		int score2 = 97;
		int score3 = 94;
		
		Scanner sc = new Scanner(System.in);
		/* program & processó��...
		 * 		>> Scanner��� ������ Ȱ��ȭ���� sc��� �̸��� ���δ�
		 * 		>> sc�� ��ü�� Scanner (���α׷��� �� ���μ���ó��)
		 * 		>> sc�� �̿��Ͽ� Scanner Ŭ���� ������ ��� ����� �޼ҵ� ��� ����
		 */
				
		/* String�� ��...
		 * String str = new String("abc");
		 * 		>> "str"�̶�� �̸����� String Ÿ�� ���� ����
		 * 		>> new String()���� "abc"��� ���ڿ��� �޸� ��򰡿� �����ϰ� �� �ּҰ��� ��ȯ
		 * 		>> ���Կ����ڷ� ��ȯ�� �ּҰ��� "str" ������ ������  ����
		 * 
		 * !!! ������ �ڽ��� �ڷ����� ������ �ڷ����� ����� �� �ִ� !!!
		 * 		>> int�� int�� �ڷḸ ���� �� �ְ�, String�� String Ÿ�� �ּҰ��� ���� �� �ִ�
		 * 
		 * String�� Scanner�� �޸� java.lang package �ȿ� ��ġ
		 * 		>> java.util & et al.�� �޸� java.lang�� ������ import �ʿ���� ���� �����ϰ� ������
		 * 
		 * String str = new String("");
		 * str.equals("A")
		 * 		>> String Ŭ���� �ӿ� �ִ� equals() �޼ҵ� ȣ��, str�� ���빰�� "A"�� �Ȱ����� �Ǻ��ϴ� �޼ҵ�
		 */

		/* Scanner
		 * java���� �����ϴ� Ŭ����... i.e. API
		 * 		>> �̹� ��3�ڿ� ���� ���ǵ� Ŭ�������� �츮�� ����� �� �ֵ��� java ��ġ �� default�� ���ԵǴ� ���ϵ�
		 * 		>> ����¿� �ʿ��� ���� �޼ҵ���� �ϳ��� Ŭ���� �ȿ� ���� ���� ��
		 * 
		 * Scanner�� ���� ��ġ
		 * 		>> C: Program Files Java jdk1.8.0_192 src.zip java util
		 * 
		 * ���� Scanner�� ��δ� java.util.Scanner sc = new Scanner(System.in);
		 * 		>> "System.in"... ǥ��������̶�� �ǹ�
		 */
		
		System.out.printf("ù��° ������ �Է��ϼ��� : ");
		/* �ǹ�
		 * 		>> java.lang�� ��ġ�� "System"�̶�� Ŭ������ ����
		 * 		>> System Ŭ���� �� "out"�̶�� �Ӽ��� ����
		 *  	>> �Ӽ��� ���� "printf"�̶�� �Լ��� �����Ͽ� ����
		 */
		score1 = sc.nextInt();
		System.out.printf("�ι�° ������ �Է��ϼ��� : ");
		score2 = sc.nextInt();
		System.out.printf("����° ������ �Է��ϼ��� : ");
		score3 = sc.nextInt();
		// "."�� ���ٿ�����... Ư�� �޼ҵ峪 ����� �����ϱ� ���� ����
		// ()�� ���� ���� �޼ҵ��� �ǹ����� �� �ڵ带 �����ϸ鼭 �� �޼ҵ带 �����϶�� �ǹ�
		
		/* IO(�����)�� ��Ʈ��ũ ���õ� Ŭ���� ��� �Ŀ��� close() �޼ҵ带 ����Ͽ� �ڿ��� �ݾ��־�� (������ �����ؾ�)
		 * BUT Scanner�� �ڵ����� �����Ǿ sc.close();�� ���� �ʾƵ� �ȴ�
		 */
		sc.close();
		
		// ���� ���� ����
		int total;
		
		// ��� ���� ����
		float average;
		
		// +, -, *, /
		total = score1 + score2 + score3;
		average = total / 3.0F;
		// average = total / (float) 3;
		// average = (float)total / 3;
		
		/* �̰��� �ȵȴ�!!
		 * �̹� ��ȣ �ӿ��� total/3�ϰ� �Ҽ����� ���� �� ������� float�� �ٲܻ��̴�
		 * average = (float)(total / 3); == average = total / 3;
		 */
		
		// printf() �޼ҵ�� ����ϱ�
		System.out.printf("���� : %d��, ��� : %.2f��", total, average);
		
	}
	
}