package console;

// INCOMPLETE!!

import java.util.LinkedList;
import java.util.Scanner;

// ����ڰ� �Է��� ��ɶ����� save(String input)�޼���� �����ϰ� history()�޼���� ������� �Է� �̷��� �����ִ� ����
class ConsoleAppMod2 {
	static String[] argArr; // ����� �Է��� ������� ���ڿ� �迭
	static LinkedList q = new LinkedList(); // ������� �Է��� ������ queue�μ� LinkedList Ŭ������ ��ü ����
	static final int MAX_SIZE = 5; // q�� �ִ� ũ��
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		while(true)	{
			String prompt = ">> ";
			System.out.print(prompt);
			
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			input = scan.nextLine();
			
			save(input);
			
			// �Է� ���� ������ �յ� ������ �����Ѵ�
			input.trim();
			
			// �Է� ���� ��ɶ����� ������ ������ �����ڷ� �ؼ� ������ argArr�� ��´�. (String Ŭ������ split() ���)
			argArr = input.split(" ");
			
			// q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
			if(input.equalsIgnoreCase("q")) {
				// break; --> while�� ����� ��
				System.exit(0); // --> ���α׷� �����ϴ� ��
			} else {
				for(String str : argArr) {
					if(str.equals("")) { continue; }
						/* �� ���ڿ��̸� continue�� ���� >>
						 * ex) ����� �Է� --> "1 2  3   4" --> 1 & 2 ���̿� ���� �� ĭ, 2 & 3 ���̿� ���� 2ĭ, 3 & 4 ���̿� ���� 3ĭ
						 * 	>> ������ �������� �����ϱ� (split(" ")) ���� �յڰ� ���� �ٸ� ���ڿ��� ����
						 * 	>> ������ ������ 2ĭ �̻��� �� --> ���� ����ĭ�� ������ �������� ������, �� ����� ���� ���̴� �ƹ��͵� ����
						 * 	>> �ƹ��͵� �����ϱ� argArr���� �ش� ĭ�� �� ���ڿ��� ����ȴ�
						 */
					else { System.out.println(str); }
				} // for���� ��.
			} // if-else���� ��.
		} // while(true)�� ��.
	} // main()�� ��.
} // class�� ��.
