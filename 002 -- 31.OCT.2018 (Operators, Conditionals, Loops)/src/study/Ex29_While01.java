package study;

public class Ex29_While01 {
	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
		// �� for���� while������ �ٲٱ�
		int i = 1;
		while(i<=3) {
			System.out.println(i++);
			
			/* System.out.println(i++);
			 * 
			 * IS THE SAME AS
			 * 
			 * System.out.println(i);
			 * i++;
			 */
		}
	}

}
