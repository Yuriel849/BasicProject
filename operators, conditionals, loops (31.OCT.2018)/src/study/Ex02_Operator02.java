package study;

public class Ex02_Operator02 {
	public static void main(String args[]) {
		int num1 = 10;
		int num2 = 4;
		int num3 = 7;
		int num4 = 15;
		
		/* AND ������ (&&)
		 * ���װ� ������ ��� ���� ��쿡�� ���� ��ȯ
		 * AND �����ڴ� ������ ���� false�� ��� ������ ���� �������� ����
		 */
		System.out.printf("%b && %b = %b\n", false, false, false && false);
		System.out.printf("%b && %b = %b\n", false, true, false && true);
		System.out.printf("%b && %b = %b\n", true, false, true && false);
		System.out.printf("%b && %b = %b\n\n", true, true, true && true);
		// %b <-- boolean�� ���Ĺ���, true or false 2���� ���� ǥ���� �� ����
		
		/* OR ������ (||)
		 * ���װ� ������ ��� ������ ��쿡�� ������ ��ȯ
		 * OR �����ڴ� ������ ���� true�� ��� ������ ���� �������� ����
		 */
		System.out.printf("%b || %b = %b\n", false, false, false || false);
		System.out.printf("%b || %b = %b\n", false, true, false || true);
		System.out.printf("%b || %b = %b\n", true, false, true || false);
		System.out.printf("%b || %b = %b\n\n", true, true, true || true);
		
		// NOT ������ (!)
		System.out.printf("!%b = %b\n", true, !true);
		System.out.printf("!%b = %b\n", false, !false);
		
	}

}