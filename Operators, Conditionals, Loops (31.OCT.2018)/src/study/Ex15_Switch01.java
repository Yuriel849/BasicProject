package study;

/* TO RENAME IN THE PACKAGE EXPLORER
 * 		>> highlight the class or package and press 'F2' on the keyboard
 * 
 * TO MAKE A COPY IN THE PACKAGE EXPLORER
 * 		>> ctrl+c + ctrl+v�� ���� ���纻 ���� �� �ִ�.
 * 		>> ���� ������ ���� ��ü�� �����ϰ� ���� �� ��� ����
 */
public class Ex15_Switch01 {
	public static void main(String args[]) {
		int number = 1;
		
		// switch�� case�� �ܼ��񱳸� �����ϴ�
		switch(number) {
		case 1: // if(number == 1);
			System.out.println("case 1 ����");
			if (true) {
				break;
			} // break�� �߰�ȣ �ϳ��� �����... break�� �ݺ��� switch������ ȿ���ְ� if������ ���ǹ�
		case 2: // else if(number == 2);
			System.out.println("case 2 ����"); break;
		case 3: // else if(number == 3);
			System.out.println("case 3 ����"); break;
		default:// else
			System.out.println("default ����");
			// ������ default�� �������̱⿡ default���� break;�� optional
		}
	}

}
