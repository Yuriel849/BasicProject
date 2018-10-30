package study;

public class Ex01_PrintMethods {
	public static void main(String args[]) {
		// Java�� ��� �޼ҵ� --> print, println, printf
		
		// 1. print
		/* �޼ҵ��� ���ڰ��� �ܼ� ȭ�鿡 �����
		 * 		>> "���ڰ�"�� �޼ҵ��� () �ӿ� ���� ��
		 * �ڵ� �ٹٲ� X
		 */
		// Hello Java !!!
		System.out.print("1. Hello");
		System.out.print(" Java !!!\n");
		
		// Hello
		// Java !!!
		System.out.print("\n");
		System.out.print("2. Hello \n");
		System.out.print("Java !!!");
		System.out.print("\n\n");
		// \n <-- new line
		
		// 2. println
		/* �޼ҵ��� ���ڰ��� �ܼ� ȭ�鿡 �����
		 * �ڵ� �ٹٲ� O
		 */
		// Hello
		// Java !!!
		System.out.println("3. Hello");
		System.out.println("Java !!!");
		
		// 3. printf
		/* ���Ĺ��ڸ� ����ؼ� ������ ���� ���߾ ȭ�鿡 �����
		 * 		>> "���Ĺ���" == ��ȯ����
		 * 		%s: ���ڿ�		%c: ���� �ϳ�
		 * 		%d: ����(10����)	%f: �Ǽ�(float)
		 * �ڵ� �ٹٲ� X
		 * 		>> printf�� ���ؼ� \n ��� %n ����ص� �ȴ�
		 */
		System.out.printf("\n4. %s ������ %d ���Դϴ�.", "����", 100);
		System.out.printf("%n5. %s ������ %d ���Դϴ�.\n", "����", 200);
		/* ���� ���ڸ� �����ϱ� ���ؼ� ","�� ���
		 * 		>> (format, args) == ù��° ���� format, �ι�° ���� args
		 * 		>> args���� s�� ���� ���� �������� ���ڸ� ���⿡ ���� �� �ִٴ� ��
		 * 		>> ","�� �����ϱ⸦ ù��° "," ���� ���� ��ü�� format�� �Ҵ��ϰ� �� ���� ��� ������ args�� �Ҵ�
		 * ''�� ���� �ϳ��� �ް�, ""�� ���ڿ��� �ް�
		 */
		System.out.printf("\n6. %5s ������ %+5d ���Դϴ�.", "����", -100);
		System.out.printf("%n7. %5s ������ %+5d ���Դϴ�.\n", "����", 200);
		
		System.out.printf("\n8. %-5s ������ %+-5d ���Դϴ�.", 'K', -100);
		System.out.printf("%n9. %-5s ������ %-+5d ���Դϴ�.\n", 888, -200);
		/* "%s"���ٰ� String ���� ���� �־ �ڵ����� String���� ��ȯ��Ű�⿡ ���� ���� ����ȴ�.
		 * �ٸ� �������� �������⿡ �� ������� �ʰ�, �˸��� ���Ĺ��ڰ� ������ �װ��� ���� ���� ����.
		 */
		
	}
	
}
