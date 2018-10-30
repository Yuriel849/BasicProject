package study;

public class N02_Star {
	public static void main(String[] args) {
		// sysout �Է� �� ctrl + space --> System.out.println();
		System.out.println();

		// ctrl + "/" --> �ּ�ó��
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
//		System.out.println("Hello");
		
		// ctrl + "+" & ctrl + "-" --> �۾� ũ�� Ű��� & ���̱�
		// ctrl + "D" --> �ش� �� ����
		
		System.out.println("Ư�� ��ġ���� (x, y)��ǥ ��� >>");
		// for �� - �ݺ���, 1~5���� ��� 5�� �ݺ�
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) { // for �� ����
			// alt + arrow key --> �ش� �� ��/�Ʒ� �̵�
				if (i == j) { // i & j�� ���� ��
					System.out.print("[" + i + "," + j + "]");
				} else { // i & j�� ���� ���� ��
					System.out.print("- - -"); // ��ĭ 5ĭ ��� ([i,j]�� 5ĭ�̱⿡)
				}
				
			}
			System.out.println();
		} // for �� ��
		
		System.out.println("\nƯ�� ��ġ���� \"STAR\" ��� >>");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print("(STAR)");
				} else {
					System.out.print("------");
				}
				
			}
			System.out.println();
		}

		System.out.println("\n���� ���ĺ� �������� ����ϱ� >>");
		for(char ch1 = 'z'; ch1 >= 'a'; ch1--) {
			for(char ch2 = 'a'; ch2 <= 'z'; ch2++) {
				if (ch2 < ch1) {
					System.out.print(" ");
				} else {
					System.out.print(ch2);
				}
				
			}
			System.out.println();
		}
		
		System.out.println("\n1~9���� �������� ����ϱ� >>");
		for(int i = 9; i > 0; i--) {
			System.out.print("     ");
			for(int j = 1; j <= 9; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
				
			}
			System.out.println();
		}

	}
}
