package study;

import java.util.ArrayList;

public class Ex28_For08 {
	public static void main(String[] args) {
		// �Ϲ� for��
		for(int i=0; i<9; i++) {
			System.out.println(i);
		}
		
		// ���� for��... �ڷᱸ�� Collection�� ����
		ArrayList<String> list = new ArrayList<String>();
		// list�� ���� ������� ArrayList<String>�� ��ġ�� ��Ÿ���� �ּҰ��� �����ϰ� �ִ�
		/* <>... generic�ϴ�
		 * �Ϲ� �迭�� ���� �ڷ����� �����͸� �޾Ƶ��� �� �ִ�... char�� ������ �迭�� char��
		 * �ڷᱸ�� ArrayList�� ���� �ٸ� �ڷ����� ���� ������ �� �ִ�... ������ ���� �ڷ����� ��Ƴ��� ���� ȿ����
		 * <> �ӿ� �ڷ����� �����ϸ� �� ArrayList�� �� �ڷ����� �����͸� ������ �� �ְ� ����
		 */
		
		list.add("����");
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("����");
		
		// enhanced for
		for(String fruit : list) {
			/* list���� �ݺ��� ������ ������� �����͸� ������ fruit ������ ����
			 * ù��° �ݺ����� fruit = ����, �ι�° �ݺ����� fruit = ���...
			 */
			System.out.println(fruit);
			
		}
		
	}

}
