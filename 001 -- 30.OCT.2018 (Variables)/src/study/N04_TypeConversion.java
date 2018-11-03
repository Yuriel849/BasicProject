package study;

public class N04_TypeConversion {

	public static void main(String[] args) {
		float f = 3.99f; // same as float f = (float) 3.99;
		System.out.println((int) f); // �ݿø� ���� �Ҽ��� ���ϸ� �׳� ������

		int i = 3;
		char ch = (char) (i+'0'); // ���� 3 --> ���� '3'
		System.out.println(ch);
		
		i = '9' - '0'; // ���� '9' --> ���� 9
		System.out.println(i);
		
		String s = i + ""; // ���� 9 --> ���ڿ� "9"
		System.out.println(i);
		
		i = Integer.parseInt("3"); // ���ڿ� "3" --> ���� 3
		System.out.println(i);
		
		double d = (double) i; // ���� 3 --> �Ǽ� 3.0
		System.out.println(d);
		/* System.out.println(d = 5.0);
		 * 		--> System.out.println(5.0); �� ����
		 * 			d�� �� 5.0�� ���Եǰ�, �������� ����� 5.0�� ��ȯ�ȴ�
		 */
		
		byte a = 10;
		byte b = 20;
		/* byte c = a + b;
		 * 	>> ����
		 * 		>> byte + byte --> int + int --> int --> int�� byte�� ���� �Ұ�!!
		 */
		byte c = (byte) (a + b);
		System.out.println(c);
		
		int h = 1_000_000; // ���ڿ� ������ھ� �ƹ����� �־ ���� ����
		int e = 100_0_000; // �ٸ� ������ �� �տ� ������ھ� ���� ���� ���� (ex) _1000)
		/* long f = h * e;
		 * 	>> h, e�� ���� int�� ���� �� --> ���� ����
		 * 		>> int * int --> int�� ������ �ʰ��� �� �߻� --> �����÷ο� 
		 */
		long g = (long) h * e; // ������ A, B �� �� �ϳ��� long���� Ŀ���� ������ �ϳ��� ���� �ڵ� ����ȯ �Ѵ�
		// == long f = 1000000L * e;
		System.out.println(g); // �����÷ο� �߻�		
	}

}
