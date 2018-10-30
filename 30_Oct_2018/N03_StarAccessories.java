package study;

public class N03_StarAccessories {
	public static void main(String[] args) {
		int i, j, k;
		
		System.out.println(" 1�� : �� 5���� 5�� ����ϱ�");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print(" * ");	
			}
			System.out.println();
		}

		System.out.println("\n 2�� : ���ʿ��� ���������� �� �̵��ϸ鼭 �� 1���� ����ϱ�");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n 3�� : �����ʿ��� �������� �� �̵��ϸ鼭 �� 1���� ����ϱ�");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (i + j == 6) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n 4�� : ���� X�� ����� ����ϱ�");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (j == i || j + i == 6) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n 5�� : ���ʿ��� ���������� ��������");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (i >= j) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

		System.out.println("\n 6�� : ���ʿ��� ���������� �������� ����");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print("   ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		
		/*
		 *  ******	   --> 1��   6��
		 *  *******	   --> 2��   7��
		 *  ********   --> 3��   8��
		 *  *********  --> 4��   9��
		 *  ********** --> 5�� 10��
		 */
		System.out.println("\n 7�� : 5X5�� + 5��");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i+5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("\n 8�� : �Ƕ�̵� ��� 01");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i+4; j++) {
				if(i + j >= 6) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		
		System.out.println("\n 8�� : �Ƕ�̵� ��� 02");
		for(i = 1, k = 4; i <= 5; i++, k--) {
			for(j = 1; j <= 9; j++) {
				if (j <= k || j > (9-k)) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n 9�� : ��� 01");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (i > j && i + j > 6) {
					System.out.print("   ");
				} else if (i < j && i + j < 6) {
					System.out.print("   ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n 9�� : ��� 02");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (i >= j && i + j <= 6) {
					System.out.print(" * ");
				} else if (i <= j && i + j >= 6) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n 9�� : ��� 03");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (!((i + j < 6 && i < j) || (i > j && i + j > 6))) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}

		System.out.println("\n10�� : ��� 01 ");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if (i >= j && i + j >= 6) {
					System.out.print(" * ");
				} else if (i <= j && i + j <= 6) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("\n10�� : ��� 02");
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				if ((i + j <= 6 && i <= j) || (i >= j && i+j >= 6)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}
	}

}
