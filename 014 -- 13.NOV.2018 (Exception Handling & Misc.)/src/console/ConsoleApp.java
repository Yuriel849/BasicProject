package console;

import java.util.Scanner;

class ConsoleApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		while(true)	{
			String prompt = ">> ";
			System.out.print(prompt);
			
			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			input = scan.nextLine();
			
			// q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
			if(input.equalsIgnoreCase("q")) {
				// break; --> while�� ����� ��
				System.exit(0); // --> ���α׷� �����ϴ� ��
			}
			
		} // while(true)�� ��.
	} // main()�� ��.
} // class�� ��.
