package study;

public class Ex27_For07 {
	public static void main(String[] args) {
		
		// �⺻�� ����
		int number = 10;
		number = 20;
		// number�� ��: 10 --> 20
		
		// �迭
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		// int[] array == int array[]
		System.out.println(array[0] + "\n");
		
		for(int i=0; i<9; i++) {
			System.out.println("array[" + i + "] : " + array[i]);
		}

/*		 ��ü �ּ�ó��
		 * left ctrl + left shift + slash(/)
		 * ��ü �ּ�ó�� ����
		 * left ctrl + left shift + reverse slash(\)
*/		 
		
		String str = "abc";
		// index�� ��ġ�� �ִ� ���ڸ� ��ȯ
		char ch = str.charAt(1);
		System.out.print(ch);
		// ch���� str�� 1��° �ڸ��� ��, 'b'
	}

}
