package study;

public class Ex07_Operator07 {
	public static void main(String args[]) {
		//���׿�����
		int x = -10;
		int result = (x>=0) ? x : -x;
		System.out.println("result : " + result + "\n");
		
		int number = 11;
		String str = (number % 2 == 0) ? "¦���Դϴ�" : "Ȧ���Դϴ�";
		System.out.println("Even or Odd?? (number = " + number + ") : " + str);
		System.out.printf("Even or Odd?? (number = %d) : %s\n\n", number, str);
		
		int gender = 1;
		String str2 = (gender == 1 || gender == 3) ? "����" : "����";
		System.out.printf("����� %s�Դϱ�?", str2);
	}

}